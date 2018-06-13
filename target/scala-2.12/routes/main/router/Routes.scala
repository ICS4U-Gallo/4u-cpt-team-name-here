// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Wed Jun 13 13:50:22 EDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:10
  LinearController_2: controllers.LinearController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:10
    LinearController_2: controllers.LinearController
  ) = this(errorHandler, HomeController_0, Assets_1, LinearController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, LinearController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu""", """controllers.LinearController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/linear""", """controllers.LinearController.linear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/linear""", """controllers.LinearController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/show""", """controllers.LinearController.show()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/solveM""", """controllers.LinearController.solveM()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LinearController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_LinearController_index2_invoker = createInvoker(
    LinearController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "index",
      Nil,
      "GET",
      this.prefix + """menu""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LinearController_linear3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/linear")))
  )
  private[this] lazy val controllers_LinearController_linear3_invoker = createInvoker(
    LinearController_2.linear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "linear",
      Nil,
      "GET",
      this.prefix + """menu/linear""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LinearController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/linear")))
  )
  private[this] lazy val controllers_LinearController_save4_invoker = createInvoker(
    LinearController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "save",
      Nil,
      "POST",
      this.prefix + """menu/linear""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LinearController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/show")))
  )
  private[this] lazy val controllers_LinearController_show5_invoker = createInvoker(
    LinearController_2.show(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "show",
      Nil,
      "GET",
      this.prefix + """menu/show""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LinearController_solveM6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/solveM")))
  )
  private[this] lazy val controllers_LinearController_solveM6_invoker = createInvoker(
    LinearController_2.solveM(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "solveM",
      Nil,
      "GET",
      this.prefix + """menu/solveM""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_LinearController_index2_route(params@_) =>
      call { 
        controllers_LinearController_index2_invoker.call(LinearController_2.index())
      }
  
    // @LINE:11
    case controllers_LinearController_linear3_route(params@_) =>
      call { 
        controllers_LinearController_linear3_invoker.call(LinearController_2.linear())
      }
  
    // @LINE:12
    case controllers_LinearController_save4_route(params@_) =>
      call { 
        controllers_LinearController_save4_invoker.call(LinearController_2.save())
      }
  
    // @LINE:13
    case controllers_LinearController_show5_route(params@_) =>
      call { 
        controllers_LinearController_show5_invoker.call(LinearController_2.show())
      }
  
    // @LINE:14
    case controllers_LinearController_solveM6_route(params@_) =>
      call { 
        controllers_LinearController_solveM6_invoker.call(LinearController_2.solveM())
      }
  }
}
