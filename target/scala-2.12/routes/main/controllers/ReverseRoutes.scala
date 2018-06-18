// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Sat Jun 16 00:36:13 EDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:16
  class ReverseVectorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def show(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/vector/show")
    }
  
    // @LINE:20
    def crossProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/vector/show/crossProduct")
    }
  
    // @LINE:19
    def dotProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/vector/show/dotProduct")
    }
  
    // @LINE:16
    def vector(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/vector")
    }
  
    // @LINE:17
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "menu/vector")
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseLinearController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def solveM(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/linear/show/solveM")
    }
  
    // @LINE:13
    def show(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/linear/show")
    }
  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "menu/linear")
    }
  
    // @LINE:11
    def linear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/linear")
    }
  
    // @LINE:15
    def solveB(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/solveB")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseQuadraticController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def show(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/quadratic/show")
    }
  
    // @LINE:22
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "menu/quadratic")
    }
  
    // @LINE:24
    def solveX(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/quadratic/show/solveX")
    }
  
    // @LINE:21
    def quadratic(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/quadratic")
    }
  
  }


}
