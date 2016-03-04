package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import com.avaje.ebean.Model;

/** Member: class for undergraduate members of the UNC campus Y
 *  includes getters and setters for all fields, search via static finder object
 * Created by cloftin on 10/3/15.
 */
@Entity
public class Member extends Model{

    @Required
    private String firstName, lastName;

    //email required and must be a valid email (something@domain)
    @Required
    @Email
    @Id
    private String email;

    //passwords required and must be at least 8 characters long
    @Required
    @MinLength(8)
    private String password;

    private String gradYear;

    private String major, secondMajor;

    //PID required, numbers with no spaces, length 9
    @MinLength(9)
    @MaxLength(9)
    @Pattern("^[0-9]*$")
    private String PID; //PID is a string as it is displayed

    @MaxLength(140)
    private String blurb;

    //not required
    private String organization;

    private long image_id; //id for image associated with this user, can be changed at any time

    //static ebean finder searches for a student member by some string
    public static Finder<String, Member> find = new Model.Finder<String, Member>(Member.class);
    //all searches go through this static object, code is in the Application itself

    //default constructor
    public Member(){}

    //constructor
    public Member(String firstName, String lastName, String email, String password, String gradYear, String major, String secondMajor, String PID, String blurb, String organization, long image_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gradYear = gradYear;
        this.major = major;
        this.secondMajor = secondMajor;
        this.PID = PID;
        this.blurb = blurb;
        this.organization = organization;
        this.image_id = image_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getSecondMajor() {
        return secondMajor;
    }

    public void setSecondMajor(String secondMajor) {
        this.secondMajor = secondMajor;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public long getImage_id() {
        return image_id;
    }

    public void setImage_id(long image_id) {
        this.image_id = image_id;
    }

    @play.db.ebean.Transactional
    public static Member authenticate(String email, String password){
        //perform a databse search for this email
        //Member result = find.where().eq("email", email).findUnique();
        //check that password matches
        //TODO: find Unique will fail if there is more than one account with this email

        Member result = find.where().eq("email", email).eq("password", password).findUnique();

        if(result == null){
            //did not find a member with this email
            return null;
        }

        String stored_password = result.getPassword();

        if(stored_password != null && stored_password.equals(password)){
            //success!
            return result;
        }
        else{
            //invalid login or no password associated with this account
            return null;
        }
    }

}