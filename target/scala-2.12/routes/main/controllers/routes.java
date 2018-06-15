// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Thu Jun 14 13:03:22 EDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseVectorController VectorController = new controllers.ReverseVectorController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLinearController LinearController = new controllers.ReverseLinearController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseVectorController VectorController = new controllers.javascript.ReverseVectorController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLinearController LinearController = new controllers.javascript.ReverseLinearController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
