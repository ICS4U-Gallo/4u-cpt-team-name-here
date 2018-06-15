
package views.html.Menu

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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Linear,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(equation : Linear):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*3.2*/main("show")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/equation/*4.18*/.getEquation),format.raw/*4.30*/("""</h1>
    <a href=""""),_display_(/*5.15*/routes/*5.21*/.LinearController.solveM()),format.raw/*5.47*/("""">Solve for m<br/></a>
    <a href=""""),_display_(/*6.15*/routes/*6.21*/.LinearController.solveB()),format.raw/*6.47*/("""">Solve for b<br/></a>
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.LinearController.linear()),format.raw/*7.47*/("""">Go back</a>
""")))}))
      }
    }
  }

  def render(equation:Linear): play.twirl.api.HtmlFormat.Appendable = apply(equation)

  def f:((Linear) => play.twirl.api.HtmlFormat.Appendable) = (equation) => apply(equation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 14 09:17:22 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Menu/show.scala.html
                  HASH: 1b5932b9ade9bf64bbcc60a8210b3ec1a088c0f8
                  MATRIX: 952->1|1044->23|1089->20|1117->41|1137->53|1175->54|1207->60|1238->65|1254->73|1286->85|1333->106|1347->112|1393->138|1457->176|1471->182|1517->208|1581->246|1595->252|1641->278
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7
                  -- GENERATED --
              */
          