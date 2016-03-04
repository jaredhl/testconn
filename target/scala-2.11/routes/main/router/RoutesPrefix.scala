
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jared/Documents/CampusY/testconn/conf/routes
// @DATE:Fri Mar 04 15:23:58 EST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
