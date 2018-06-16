
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

object quadratic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Quadratic,Form[models.Quadratic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(quadratic : models.Quadratic)(quadraticForm : Form[models.Quadratic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.72*/("""
"""),_display_(/*3.2*/main("Quadratic")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<h1>Quadratic<br/></h1>
<p><br/>Enter known fields and press submit<br/> Click the equation once you enter the fields<br/></p>
<a href=""""),_display_(/*6.11*/routes/*6.17*/.QuadraticController.show()),format.raw/*6.44*/("""">"""),_display_(/*6.47*/quadratic/*6.56*/.getEquation),format.raw/*6.68*/("""</a>
"""),_display_(/*7.2*/helper/*7.8*/.form(CSRF(routes.QuadraticController.save()))/*7.54*/{_display_(Seq[Any](format.raw/*7.55*/("""
"""),_display_(/*8.2*/helper/*8.8*/.inputText(quadraticForm("a"))),format.raw/*8.38*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(quadraticForm("b"))),format.raw/*9.38*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputText(quadraticForm("c"))),format.raw/*10.38*/("""
"""),format.raw/*11.1*/("""<input type = "submit" value = "Submit Equation">
""")))}),format.raw/*12.2*/("""
"""),format.raw/*13.1*/("""<a href=""""),_display_(/*13.11*/routes/*13.17*/.LinearController.index()),format.raw/*13.42*/("""">Go back</a>
""")))}))
      }
    }
  }

  def render(quadratic:models.Quadratic,quadraticForm:Form[models.Quadratic]): play.twirl.api.HtmlFormat.Appendable = apply(quadratic)(quadraticForm)

  def f:((models.Quadratic) => (Form[models.Quadratic]) => play.twirl.api.HtmlFormat.Appendable) = (quadratic) => (quadraticForm) => apply(quadratic)(quadraticForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 16 00:48:02 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Quadratic/quadratic.scala.html
                  HASH: 6bb8ae266402f28304a54d2267a92637424763c6
                  MATRIX: 995->1|1138->74|1183->71|1211->92|1236->109|1274->110|1302->112|1467->251|1481->257|1528->284|1557->287|1574->296|1606->308|1638->315|1651->321|1705->367|1743->368|1771->371|1784->377|1834->407|1862->410|1875->416|1925->446|1954->449|1968->455|2019->485|2048->487|2130->539|2159->541|2196->551|2211->557|2257->582
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|45->13|45->13|45->13|45->13
                  -- GENERATED --
              */
          