// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/conf/routes
// @DATE:Sat Jun 16 00:36:13 EDT 2018

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
  Assets_3: controllers.Assets,
  // @LINE:10
  LinearController_1: controllers.LinearController,
  // @LINE:16
  VectorController_4: controllers.VectorController,
  // @LINE:21
  QuadraticController_2: controllers.QuadraticController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_3: controllers.Assets,
    // @LINE:10
    LinearController_1: controllers.LinearController,
    // @LINE:16
    VectorController_4: controllers.VectorController,
    // @LINE:21
    QuadraticController_2: controllers.QuadraticController
  ) = this(errorHandler, HomeController_0, Assets_3, LinearController_1, VectorController_4, QuadraticController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_3, LinearController_1, VectorController_4, QuadraticController_2, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/linear/show""", """controllers.LinearController.show()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/linear/show/solveM""", """controllers.LinearController.solveM()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/solveB""", """controllers.LinearController.solveB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/vector""", """controllers.VectorController.vector()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/vector""", """controllers.VectorController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/vector/show""", """controllers.VectorController.show()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/vector/show/dotProduct""", """controllers.VectorController.dotProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/vector/show/crossProduct""", """controllers.VectorController.crossProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/quadratic""", """controllers.QuadraticController.quadratic()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/quadratic""", """controllers.QuadraticController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/quadratic/show""", """controllers.QuadraticController.show()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/quadratic/show/solveX""", """controllers.QuadraticController.solveX()"""),
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
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    LinearController_1.index(),
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
    LinearController_1.linear(),
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
    LinearController_1.save(),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/linear/show")))
  )
  private[this] lazy val controllers_LinearController_show5_invoker = createInvoker(
    LinearController_1.show(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "show",
      Nil,
      "GET",
      this.prefix + """menu/linear/show""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LinearController_solveM6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/linear/show/solveM")))
  )
  private[this] lazy val controllers_LinearController_solveM6_invoker = createInvoker(
    LinearController_1.solveM(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "solveM",
      Nil,
      "GET",
      this.prefix + """menu/linear/show/solveM""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LinearController_solveB7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/solveB")))
  )
  private[this] lazy val controllers_LinearController_solveB7_invoker = createInvoker(
    LinearController_1.solveB(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LinearController",
      "solveB",
      Nil,
      "GET",
      this.prefix + """menu/solveB""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_VectorController_vector8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/vector")))
  )
  private[this] lazy val controllers_VectorController_vector8_invoker = createInvoker(
    VectorController_4.vector(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VectorController",
      "vector",
      Nil,
      "GET",
      this.prefix + """menu/vector""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_VectorController_save9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/vector")))
  )
  private[this] lazy val controllers_VectorController_save9_invoker = createInvoker(
    VectorController_4.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VectorController",
      "save",
      Nil,
      "POST",
      this.prefix + """menu/vector""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_VectorController_show10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/vector/show")))
  )
  private[this] lazy val controllers_VectorController_show10_invoker = createInvoker(
    VectorController_4.show(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VectorController",
      "show",
      Nil,
      "GET",
      this.prefix + """menu/vector/show""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_VectorController_dotProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/vector/show/dotProduct")))
  )
  private[this] lazy val controllers_VectorController_dotProduct11_invoker = createInvoker(
    VectorController_4.dotProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VectorController",
      "dotProduct",
      Nil,
      "GET",
      this.prefix + """menu/vector/show/dotProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_VectorController_crossProduct12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/vector/show/crossProduct")))
  )
  private[this] lazy val controllers_VectorController_crossProduct12_invoker = createInvoker(
    VectorController_4.crossProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VectorController",
      "crossProduct",
      Nil,
      "GET",
      this.prefix + """menu/vector/show/crossProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_QuadraticController_quadratic13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/quadratic")))
  )
  private[this] lazy val controllers_QuadraticController_quadratic13_invoker = createInvoker(
    QuadraticController_2.quadratic(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuadraticController",
      "quadratic",
      Nil,
      "GET",
      this.prefix + """menu/quadratic""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_QuadraticController_save14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/quadratic")))
  )
  private[this] lazy val controllers_QuadraticController_save14_invoker = createInvoker(
    QuadraticController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuadraticController",
      "save",
      Nil,
      "POST",
      this.prefix + """menu/quadratic""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_QuadraticController_show15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/quadratic/show")))
  )
  private[this] lazy val controllers_QuadraticController_show15_invoker = createInvoker(
    QuadraticController_2.show(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuadraticController",
      "show",
      Nil,
      "GET",
      this.prefix + """menu/quadratic/show""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_QuadraticController_solveX16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/quadratic/show/solveX")))
  )
  private[this] lazy val controllers_QuadraticController_solveX16_invoker = createInvoker(
    QuadraticController_2.solveX(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuadraticController",
      "solveX",
      Nil,
      "GET",
      this.prefix + """menu/quadratic/show/solveX""",
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
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_LinearController_index2_route(params@_) =>
      call { 
        controllers_LinearController_index2_invoker.call(LinearController_1.index())
      }
  
    // @LINE:11
    case controllers_LinearController_linear3_route(params@_) =>
      call { 
        controllers_LinearController_linear3_invoker.call(LinearController_1.linear())
      }
  
    // @LINE:12
    case controllers_LinearController_save4_route(params@_) =>
      call { 
        controllers_LinearController_save4_invoker.call(LinearController_1.save())
      }
  
    // @LINE:13
    case controllers_LinearController_show5_route(params@_) =>
      call { 
        controllers_LinearController_show5_invoker.call(LinearController_1.show())
      }
  
    // @LINE:14
    case controllers_LinearController_solveM6_route(params@_) =>
      call { 
        controllers_LinearController_solveM6_invoker.call(LinearController_1.solveM())
      }
  
    // @LINE:15
    case controllers_LinearController_solveB7_route(params@_) =>
      call { 
        controllers_LinearController_solveB7_invoker.call(LinearController_1.solveB())
      }
  
    // @LINE:16
    case controllers_VectorController_vector8_route(params@_) =>
      call { 
        controllers_VectorController_vector8_invoker.call(VectorController_4.vector())
      }
  
    // @LINE:17
    case controllers_VectorController_save9_route(params@_) =>
      call { 
        controllers_VectorController_save9_invoker.call(VectorController_4.save())
      }
  
    // @LINE:18
    case controllers_VectorController_show10_route(params@_) =>
      call { 
        controllers_VectorController_show10_invoker.call(VectorController_4.show())
      }
  
    // @LINE:19
    case controllers_VectorController_dotProduct11_route(params@_) =>
      call { 
        controllers_VectorController_dotProduct11_invoker.call(VectorController_4.dotProduct())
      }
  
    // @LINE:20
    case controllers_VectorController_crossProduct12_route(params@_) =>
      call { 
        controllers_VectorController_crossProduct12_invoker.call(VectorController_4.crossProduct())
      }
  
    // @LINE:21
    case controllers_QuadraticController_quadratic13_route(params@_) =>
      call { 
        controllers_QuadraticController_quadratic13_invoker.call(QuadraticController_2.quadratic())
      }
  
    // @LINE:22
    case controllers_QuadraticController_save14_route(params@_) =>
      call { 
        controllers_QuadraticController_save14_invoker.call(QuadraticController_2.save())
      }
  
    // @LINE:23
    case controllers_QuadraticController_show15_route(params@_) =>
      call { 
        controllers_QuadraticController_show15_invoker.call(QuadraticController_2.show())
      }
  
    // @LINE:24
    case controllers_QuadraticController_solveX16_route(params@_) =>
      call { 
        controllers_QuadraticController_solveX16_invoker.call(QuadraticController_2.solveX())
      }
  }
}
