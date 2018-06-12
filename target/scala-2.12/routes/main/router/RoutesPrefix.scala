// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Mon Jun 11 13:15:18 EDT 2018


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
