// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Thu Jun 14 13:03:22 EDT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:16
  class ReverseVectorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VectorController.show",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/vector/show"})
        }
      """
    )
  
    // @LINE:20
    def crossProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VectorController.crossProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/vector/show/crossProduct"})
        }
      """
    )
  
    // @LINE:19
    def dotProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VectorController.dotProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/vector/show/dotProduct"})
        }
      """
    )
  
    // @LINE:16
    def vector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VectorController.vector",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/vector"})
        }
      """
    )
  
    // @LINE:17
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VectorController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/vector"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseLinearController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def solveM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.solveM",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/linear/show/solveM"})
        }
      """
    )
  
    // @LINE:13
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.show",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/linear/show"})
        }
      """
    )
  
    // @LINE:12
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/linear"})
        }
      """
    )
  
    // @LINE:11
    def linear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.linear",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/linear"})
        }
      """
    )
  
    // @LINE:15
    def solveB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.solveB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/solveB"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LinearController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
