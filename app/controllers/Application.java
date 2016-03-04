package controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import play.mvc.*;
import play.mvc.Http.*;
import play.data.*;
import models.*;
import views.html.*;

import static play.data.Form.form;

public class Application extends Controller{

    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        //splash page for testing application
        //TODO: make the index something useful
        return redirect(routes.Application.login());
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result visitProfile(String email){
        //email will be of a user we wish to visit
        Member member = Member.find.where().eq("email", email).findUnique();
        if(member != null){
            return ok(StudentProfile.render(member));
        }
        return badRequest(StudentProfile.render(null)); //null value causes profile to render with some default info
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result profile(){
        //TODO: adding an id field may mean we have to search by id rather than findWhere() to match against emails
        Member member = getLoggedInUser();
        if(member != null){
            return ok(StudentProfile.render(member));
        }
        return badRequest(StudentProfile.render(null)); //null value causes profile to render with some default info
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result search() {
        //need this to handle the resulting string
        Form<Search> search_form = Form.form(Search.class).bindFromRequest();
        List<Member> members_first, members_last, members_email, members;
        Set<Member> all_results;

        String query = search_form.data().get("query");

        if(query == null){
            //no query yet, render just the search card
            members = new LinkedList();
        } else {
            //return a list of users with matching firstname, lastname, major, email
            //convert to set and back to lsit to clear out duplicates
            members_first = Member.find.where().ieq("firstName", query).findList();
            members_last = Member.find.where().ieq("lastName", query).findList();
            members_email = Member.find.where().ieq("email", query).findList();
            all_results = new HashSet(members_first);
            all_results.addAll(members_last);
            all_results.addAll(members_email);
            members = new LinkedList();
            members.addAll(all_results);
        }

        return ok(views.html.search.render(members, search_form));
    }

    public Result login(){
        //create a login form to get email and password
        Form<Login> loginForm = Form.form(Login.class);
        return ok(login.render(loginForm));
    }

    public Result authenticateLogin(){
        //authenticate checks for a valid username and password, annotation check the cookie
        //authenticate takes you to your login the first time, we need this behavior each time
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()){
            return badRequest(loginAlt.render(loginForm));
        } else {
            //Login loginObject = loginForm.get();
            String email = loginForm.data().get("email");
            String password = loginForm.data().get("password");
            Member result = Member.authenticate(email, password);
            if(result == null){
                return ok(login.render(loginForm)); //invalid login, no profile with that email
            }
            //login successful, reroute to profile
            session().clear();
            session("email", email); //store users email as a cookie
            return redirect(routes.Application.profile());
        }
    }

    public Result logout(){
        session().clear();
        return redirect(routes.Application.login());
    }

    @Security.Authenticated(ActionAuthenticator.class)
    public Result updateProfile(){
        //TODO: image field (which isn't something the user should be able to change) might get rendered
        //render update form prefilled with student info
        Member student = getLoggedInUser();
        Form<Member> updateForm;
        if(student != null){
            updateForm = form(Member.class).fill(student);
        } else {
            updateForm = form(Member.class); //just return an empty form
        }
        return ok(views.html.profileForm.render(updateForm, student));
//        return ok(profileForm.render(student));
    }

    @play.db.ebean.Transactional
    public Result saveProfileUpdate(){
        Form<Member> boundForm  = form(Member.class).bindFromRequest();
        Member updatedMember = boundForm.get();
        if(boundForm.hasErrors()){
            //issues with form, send it back
            return badRequest(profileForm.render(boundForm, updatedMember));
        }


        Member existingMember = getUser(updatedMember.getEmail());
        if(existingMember != null){
            //a member with this email already exists, do they need to recover their password?
            updatedMember.update();
            return redirect(routes.Application.profile());
        }
        //there was no existing user with login email in the databse
        return ok(login.render(form(Login.class)));
    }



    public Result newMember(){
        //render form for new student member
        Form<Member> newMemberForm = Form.form(Member.class);
        return ok(newStudentMember.render(newMemberForm));
    }

    @play.db.ebean.Transactional
    public Result saveNewMember() {
        //save POST request binds data to be saved from form template
        Form<Member> boundForm = form(Member.class).bindFromRequest();

        if(boundForm.hasErrors()){
            return badRequest(newStudentMember.render(boundForm));
        }

        Member member = boundForm.get();
        //check for an account with this email
        Member existingMember = getUser(member.getEmail());
        if(existingMember != null){
            //a member with this email already exists, redirect to login
            return ok(login.render(form(Login.class)));
        }

        //save member
        member.save();
        //start a new session with this email
        session("email", member.getEmail());
        //render the profile with this users information
        return redirect(routes.Application.profile());

    }


    public Result uploadPicture(){
        //generate form so user can upload a picture, might combine with update forms
        Form<Image> imageForm = form(Image.class);
        return ok(uploadPicture.render(imageForm, getLoggedInUser()));
    }

    //idea: we'll create an entirely seperate model and read images from a form
    @play.db.ebean.Transactional
    public Result receivePicture(){

        //binds an image from an image form, which gets saved to a member with the write email
        Form<Image> imageForm = form(Image.class);
        Form<Image> filledForm = imageForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    filledForm.errors().toString()
            );
        } else {
            Http.MultipartFormData body;
            body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart pic = body.getFile("pic");

            //TODO: check for valid image type and resize
            /*if(Image.ImageType.get(pic.getContentType()) == null) {
                return badRequest(
                        views.html.index.render("bad uploadPicture")
                );
            }*/



            Image image = filledForm.get();
            image.picToByte(pic.getFile());
  //          image.filePath = pic.getFile().getPath();
            image.save(); //save image by itself

            //retrieve currently logged in user, save image_id to this user (they are the one that uploaded it)
            Member member = getLoggedInUser();
            member.setImage_id(image.getInternalId());
            member.update();

            return redirect(routes.Application.profile());
        }


    }



    public Result getPicture(String email){
        //get picture associated with an image email: has to be this way because we use this to retrieve other members' images
        Member result = Member.find.where().eq("email", email).findUnique();
        long image_id = result.getImage_id(); //retrieve ID for image associated with this user (may be 0)
        if(image_id != 0L){
            //default is no ID, so we check
            Image image = Image.find.byId(image_id);
            //return ok("complete");
            try {
                return ok(new FileInputStream(image.pic()));

            } catch (FileNotFoundException f) {
                //something is wrong with the file stored in this pic
                //TODO: badrequests should not return just text, should redirect to login or something
                //current behavior is a broken link
                return badRequest("Bad image file...");
            }

        } else{
            //we don't have an image for this user, return the default
            try {
                //TODO: check that this returns the default image
                return ok(new FileInputStream("public/images/heracles.jpg"));
            } catch (FileNotFoundException f) {
                //something is wrong with the file stored in this pic
                return badRequest("Bad Default Image...");
            }
        }

    }

    @play.db.ebean.Transactional
    public Member getUser(String email){
        Member student = Member.find.where().eq("email", email).findUnique();
        return student;
    }

    @play.db.ebean.Transactional
    public Member getLoggedInUser(){
        String email = Context.current().session().get("email"); //get current email
        Member student = Member.find.where().eq("email", email).findUnique();
        return student;
    }

    @play.db.ebean.Transactional
    public Result addTestUser(){
        //utility function to add a default user to the system
        Member student = new Member();
        student.setFirstName("Test");
        student.setLastName("Testerson");
        student.setEmail("test@gmail.com");
        student.setPassword("password");
        student.setMajor("nothing");
        student.save();
        return ok("record is added");
    }

    @play.db.ebean.Transactional
    public Result modifyTestUser(){
        //TODO: issue is with updated records in general
        //retrieve the test user
        Member student = Member.find.where().eq("email", "test@gmail.com").findUnique();
        //student.setFirstName("newName");
        student.delete();
        return ok("record is updated");
    }

    //for pic testing
    public Result showpic(){
        return ok(showPicture.render(getLoggedInUser().getEmail()));
    }
}

