
package views.html.Quadratic

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object showQuadratic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Quadratic,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(equation : models.Quadratic):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main("solveX")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<h1>"""),_display_(/*3.6*/equation/*3.14*/.getEquation),format.raw/*3.26*/("""</h1>
<p>Positive x = """),_display_(/*4.18*/equation/*4.26*/.posX),format.raw/*4.31*/(""" """),format.raw/*4.32*/("""(0 by default before button is pressed)</p>
<p>Negative x = """),_display_(/*5.18*/equation/*5.26*/.negX),format.raw/*5.31*/("""  """),format.raw/*5.33*/("""(0 by default before button is pressed)</p>
<a href=""""),_display_(/*6.11*/routes/*6.17*/.QuadraticController.solveX()),format.raw/*6.46*/("""">Solve for X<br/></a>
<a href=""""),_display_(/*7.11*/routes/*7.17*/.QuadraticController.quadratic()),format.raw/*7.49*/("""">Go back</a>
""")))}))
      }
    }
  }

  def render(equation:models.Quadratic): play.twirl.api.HtmlFormat.Appendable = apply(equation)

  def f:((models.Quadratic) => play.twirl.api.HtmlFormat.Appendable) = (equation) => apply(equation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 15 14:19:28 EDT 2018
                  SOURCE: C:/Users/farbo/Farbod/4u-cpt-team-name-here/app/views/Quadratic/showQuadratic.scala.html
                  HASH: 4f26c455d93ef4ff681940307111688c22fb88f7
                  MATRIX: 976->1|1100->30|1128->33|1150->47|1188->48|1216->50|1246->55|1262->63|1294->75|1344->99|1360->107|1385->112|1413->113|1501->175|1517->183|1542->188|1571->190|1652->245|1666->251|1715->280|1775->314|1789->320|1841->352
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7
                  -- GENERATED --
              */
          