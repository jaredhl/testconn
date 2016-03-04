
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CampusY/testconn/conf/routes
// @DATE:Fri Mar 04 15:23:58 EST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:51
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def authenticateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticateLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:31
    def saveProfileUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveProfileUpdate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProfile"})
        }
      """
    )
  
    // @LINE:23
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:37
    def newMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newMember",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newMember"})
        }
      """
    )
  
    // @LINE:45
    def showpic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showpic",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pic"})
        }
      """
    )
  
    // @LINE:17
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:20
    def visitProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.visitProfile",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitProfile" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
        }
      """
    )
  
    // @LINE:9
    def addTestUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addTestUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTestUser"})
        }
      """
    )
  
    // @LINE:38
    def saveNewMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveNewMember",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newMember"})
        }
      """
    )
  
    // @LINE:26
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:29
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProfile"})
        }
      """
    )
  
    // @LINE:11
    def modifyTestUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.modifyTestUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modifyTestUser"})
        }
      """
    )
  
    // @LINE:42
    def receivePicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.receivePicture",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "image"})
        }
      """
    )
  
    // @LINE:34
    def getPicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPicture",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "picture" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:41
    def uploadPicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.uploadPicture",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "image"})
        }
      """
    )
  
  }


}