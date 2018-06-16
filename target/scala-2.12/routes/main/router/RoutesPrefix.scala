// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/farbo/Farbod/4u-cpt-team-name-here/conf/routes
// @DATE:Fri Jun 15 14:20:08 EDT 2018


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
