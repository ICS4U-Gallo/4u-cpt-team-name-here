
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

object linear extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Linear,Form[Linear],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(equation : Linear)(linearForm : Form[Linear]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.48*/("""
"""),_display_(/*3.2*/main("Linear")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>Linear</h1>
    <p><br/>Enter known fields and press submit (enter 0 for unknown fields)<br/> Click the equation once you enter the one you want<br/></p>
    <a href=""""),_display_(/*6.15*/routes/*6.21*/.LinearController.show()),format.raw/*6.45*/("""">"""),_display_(/*6.48*/equation/*6.56*/.getEquation),format.raw/*6.68*/("""</a>
    """),_display_(/*7.6*/helper/*7.12*/.form(CSRF(routes.LinearController.save()))/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(linearForm("x"))),format.raw/*8.43*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(linearForm("y"))),format.raw/*9.43*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(linearForm("b"))),format.raw/*10.43*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(linearForm("m"))),format.raw/*11.43*/("""
        """),format.raw/*12.9*/("""<input type = "submit" value = "Submit Equation">
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""<a href=""""),_display_(/*14.15*/routes/*14.21*/.LinearController.index()),format.raw/*14.46*/("""">Go back</a>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(equation:Linear,linearForm:Form[Linear]): play.twirl.api.HtmlFormat.Appendable = apply(equation)(linearForm)

  def f:((Linear) => (Form[Linear]) => play.twirl.api.HtmlFormat.Appendable) = (equation) => (linearForm) => apply(equation)(linearForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 16 00:36:14 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Menu/linear.scala.html
                  HASH: cd8fcb34acc960df4be14cdbaa14936ff72b92f2
                  MATRIX: 967->1|1086->50|1131->47|1159->68|1181->82|1219->83|1251->89|1451->263|1465->269|1509->293|1538->296|1554->304|1586->316|1622->327|1636->333|1687->376|1725->377|1762->388|1776->394|1823->421|1860->432|1874->438|1921->465|1959->476|1974->482|2022->509|2060->520|2075->526|2123->553|2160->563|2246->619|2279->625|2316->635|2331->641|2377->666|2423->682
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|46->14|47->15
                  -- GENERATED --
              */
          