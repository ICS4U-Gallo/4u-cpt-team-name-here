
package views.html.Vector

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

object showVector extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Vector,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(equation : models.Vector):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/main("solve")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
    """),format.raw/*3.5*/("""<h1>"""),_display_(/*3.10*/equation/*3.18*/.getVectors),format.raw/*3.29*/("""</h1>
    <p>Dot Product Answer = """),_display_(/*4.30*/equation/*4.38*/.dotAnswer),format.raw/*4.48*/("""  """),format.raw/*4.50*/("""(0 by default before button is pressed)</p>
    <p>Cross Product Answer = """),_display_(/*5.32*/equation/*5.40*/.crossAnswer),format.raw/*5.52*/(""" """),format.raw/*5.53*/("""(0 by default before button is pressed)</p>
    <a href=""""),_display_(/*6.15*/routes/*6.21*/.VectorController.dotProduct()),format.raw/*6.51*/("""">Dot product<br/></a>
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.VectorController.crossProduct()),format.raw/*7.53*/("""">Cross product<br/></a>
    <a href=""""),_display_(/*8.15*/routes/*8.21*/.VectorController.vector()),format.raw/*8.47*/("""">Go back</a>
""")))}))
      }
    }
  }

  def render(equation:models.Vector): play.twirl.api.HtmlFormat.Appendable = apply(equation)

  def f:((models.Vector) => play.twirl.api.HtmlFormat.Appendable) = (equation) => apply(equation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 14 13:03:22 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Vector/showVector.scala.html
                  HASH: b509cb931c6f894dfa171c1df5da130033b35324
                  MATRIX: 967->1|1088->27|1116->30|1137->43|1175->44|1207->50|1238->55|1254->63|1285->74|1347->110|1363->118|1393->128|1422->130|1524->206|1540->214|1572->226|1600->227|1685->286|1699->292|1749->322|1813->360|1827->366|1879->398|1945->438|1959->444|2005->470
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8
                  -- GENERATED --
              */
          