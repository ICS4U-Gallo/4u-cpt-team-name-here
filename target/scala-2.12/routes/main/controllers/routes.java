// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Mon Jun 11 13:15:18 EDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMenuController MenuController = new controllers.ReverseMenuController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMenuController MenuController = new controllers.javascript.ReverseMenuController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
