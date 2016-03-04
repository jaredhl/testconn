
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CampusY/testconn/conf/routes
// @DATE:Fri Mar 04 15:23:58 EST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:51
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:51
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTestUser""", """controllers.Application.addTestUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifyTestUser""", """controllers.Application.modifyTestUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticateLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitProfile$email<[^/]+>""", """controllers.Application.visitProfile(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Application.profile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProfile""", """controllers.Application.updateProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProfile""", """controllers.Application.saveProfileUpdate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """picture$email<[^/]+>""", """controllers.Application.getPicture(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newMember""", """controllers.Application.newMember()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newMember""", """controllers.Application.saveNewMember()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """image""", """controllers.Application.uploadPicture()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """image""", """controllers.Application.receivePicture()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pic""", """controllers.Application.showpic()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page
do it the hard way""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_addTestUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTestUser")))
  )
  private[this] lazy val controllers_Application_addTestUser1_invoker = createInvoker(
    Application_1.addTestUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addTestUser",
      Nil,
      "GET",
      """""",
      this.prefix + """addTestUser"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_modifyTestUser2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifyTestUser")))
  )
  private[this] lazy val controllers_Application_modifyTestUser2_invoker = createInvoker(
    Application_1.modifyTestUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "modifyTestUser",
      Nil,
      "GET",
      """""",
      this.prefix + """modifyTestUser"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login3_invoker = createInvoker(
    Application_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """GET and POST on login page retrieve page and try to login""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_authenticateLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticateLogin4_invoker = createInvoker(
    Application_1.authenticateLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticateLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout5_invoker = createInvoker(
    Application_1.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_visitProfile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitProfile"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_visitProfile6_invoker = createInvoker(
    Application_1.visitProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "visitProfile",
      Seq(classOf[String]),
      "GET",
      """load profile associated with a given email (to visit another user)""",
      this.prefix + """visitProfile$email<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_profile7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Application_profile7_invoker = createInvoker(
    Application_1.profile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profile",
      Nil,
      "GET",
      """load from http session (to look at own profile""",
      this.prefix + """profile"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_search8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_search8_invoker = createInvoker(
    Application_1.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "GET",
      """go to the search page for both alumni and students""",
      this.prefix + """search"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_updateProfile9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProfile")))
  )
  private[this] lazy val controllers_Application_updateProfile9_invoker = createInvoker(
    Application_1.updateProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProfile",
      Nil,
      "GET",
      """pull profile associated with this email and create a form for it based on alumnus or student""",
      this.prefix + """updateProfile"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_saveProfileUpdate10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProfile")))
  )
  private[this] lazy val controllers_Application_saveProfileUpdate10_invoker = createInvoker(
    Application_1.saveProfileUpdate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveProfileUpdate",
      Nil,
      "POST",
      """bind input to member and save it""",
      this.prefix + """updateProfile"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_getPicture11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("picture"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getPicture11_invoker = createInvoker(
    Application_1.getPicture(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPicture",
      Seq(classOf[String]),
      "GET",
      """used to load the picture associated with an account""",
      this.prefix + """picture$email<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_newMember12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newMember")))
  )
  private[this] lazy val controllers_Application_newMember12_invoker = createInvoker(
    Application_1.newMember(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newMember",
      Nil,
      "GET",
      """get and post request on the get member page call newMember and save(Member?)""",
      this.prefix + """newMember"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_saveNewMember13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newMember")))
  )
  private[this] lazy val controllers_Application_saveNewMember13_invoker = createInvoker(
    Application_1.saveNewMember(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveNewMember",
      Nil,
      "POST",
      """""",
      this.prefix + """newMember"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_uploadPicture14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("image")))
  )
  private[this] lazy val controllers_Application_uploadPicture14_invoker = createInvoker(
    Application_1.uploadPicture(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "uploadPicture",
      Nil,
      "GET",
      """we will keep a seperate image upload page for now, should be able to add in to the existing newmember/update forms""",
      this.prefix + """image"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_receivePicture15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("image")))
  )
  private[this] lazy val controllers_Application_receivePicture15_invoker = createInvoker(
    Application_1.receivePicture(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "receivePicture",
      Nil,
      "POST",
      """""",
      this.prefix + """image"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_showpic16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pic")))
  )
  private[this] lazy val controllers_Application_showpic16_invoker = createInvoker(
    Application_1.showpic(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showpic",
      Nil,
      "GET",
      """testing""",
      this.prefix + """pic"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_addTestUser1_route(params) =>
      call { 
        controllers_Application_addTestUser1_invoker.call(Application_1.addTestUser())
      }
  
    // @LINE:11
    case controllers_Application_modifyTestUser2_route(params) =>
      call { 
        controllers_Application_modifyTestUser2_invoker.call(Application_1.modifyTestUser())
      }
  
    // @LINE:14
    case controllers_Application_login3_route(params) =>
      call { 
        controllers_Application_login3_invoker.call(Application_1.login())
      }
  
    // @LINE:15
    case controllers_Application_authenticateLogin4_route(params) =>
      call { 
        controllers_Application_authenticateLogin4_invoker.call(Application_1.authenticateLogin())
      }
  
    // @LINE:17
    case controllers_Application_logout5_route(params) =>
      call { 
        controllers_Application_logout5_invoker.call(Application_1.logout())
      }
  
    // @LINE:20
    case controllers_Application_visitProfile6_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_visitProfile6_invoker.call(Application_1.visitProfile(email))
      }
  
    // @LINE:23
    case controllers_Application_profile7_route(params) =>
      call { 
        controllers_Application_profile7_invoker.call(Application_1.profile())
      }
  
    // @LINE:26
    case controllers_Application_search8_route(params) =>
      call { 
        controllers_Application_search8_invoker.call(Application_1.search())
      }
  
    // @LINE:29
    case controllers_Application_updateProfile9_route(params) =>
      call { 
        controllers_Application_updateProfile9_invoker.call(Application_1.updateProfile())
      }
  
    // @LINE:31
    case controllers_Application_saveProfileUpdate10_route(params) =>
      call { 
        controllers_Application_saveProfileUpdate10_invoker.call(Application_1.saveProfileUpdate())
      }
  
    // @LINE:34
    case controllers_Application_getPicture11_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_getPicture11_invoker.call(Application_1.getPicture(email))
      }
  
    // @LINE:37
    case controllers_Application_newMember12_route(params) =>
      call { 
        controllers_Application_newMember12_invoker.call(Application_1.newMember())
      }
  
    // @LINE:38
    case controllers_Application_saveNewMember13_route(params) =>
      call { 
        controllers_Application_saveNewMember13_invoker.call(Application_1.saveNewMember())
      }
  
    // @LINE:41
    case controllers_Application_uploadPicture14_route(params) =>
      call { 
        controllers_Application_uploadPicture14_invoker.call(Application_1.uploadPicture())
      }
  
    // @LINE:42
    case controllers_Application_receivePicture15_route(params) =>
      call { 
        controllers_Application_receivePicture15_invoker.call(Application_1.receivePicture())
      }
  
    // @LINE:45
    case controllers_Application_showpic16_route(params) =>
      call { 
        controllers_Application_showpic16_invoker.call(Application_1.showpic())
      }
  
    // @LINE:51
    case controllers_Assets_versioned17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_0.versioned(path, file))
      }
  }
}