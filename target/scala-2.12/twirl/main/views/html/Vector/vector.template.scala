
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

object vector extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Vector,Form[models.Vector],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vector : models.Vector)(vectorForm : Form[models.Vector]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.60*/("""
"""),_display_(/*3.2*/main("Vector")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>Vectors<br/></h1>
    <p>Enter the coordinates of the two vectors you are going to be looking at<br/>Click the vectors when you think you have the right ones inputted<br/></p>
    <a href=""""),_display_(/*6.15*/routes/*6.21*/.VectorController.show()),format.raw/*6.45*/("""">"""),_display_(/*6.48*/vector/*6.54*/.getVectors),format.raw/*6.65*/("""</a>
    """),_display_(/*7.6*/helper/*7.12*/.form(CSRF(routes.VectorController.save()))/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(vectorForm("x1"))),format.raw/*8.44*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(vectorForm("y1"))),format.raw/*9.44*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(vectorForm("z1"))),format.raw/*10.44*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(vectorForm("x2"))),format.raw/*11.44*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(vectorForm("y2"))),format.raw/*12.44*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(vectorForm("z2"))),format.raw/*13.44*/("""
        """),format.raw/*14.9*/("""<input type = "submit" value = "Submit Equation">
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""<a href=""""),_display_(/*16.15*/routes/*16.21*/.LinearController.index()),format.raw/*16.46*/("""">Go back</a>
""")))}))
      }
    }
  }

  def render(vector:models.Vector,vectorForm:Form[models.Vector]): play.twirl.api.HtmlFormat.Appendable = apply(vector)(vectorForm)

  def f:((models.Vector) => (Form[models.Vector]) => play.twirl.api.HtmlFormat.Appendable) = (vector) => (vectorForm) => apply(vector)(vectorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 15 13:12:51 EDT 2018
                  SOURCE: C:/Users/farbo/Farbod/4u-cpt-team-name-here/app/views/Vector/vector.scala.html
                  HASH: 08cd97e5a8b1a450da156a83bab4408cc458a5e2
                  MATRIX: 983->1|1114->62|1159->59|1187->80|1209->94|1247->95|1279->101|1501->297|1515->303|1559->327|1588->330|1602->336|1633->347|1669->358|1683->364|1734->407|1772->408|1809->419|1823->425|1871->453|1908->464|1922->470|1970->498|2008->509|2023->515|2072->543|2110->554|2125->560|2174->588|2212->599|2227->605|2276->633|2314->644|2329->650|2378->678|2415->688|2501->744|2534->750|2571->760|2586->766|2632->791
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|48->16|48->16|48->16|48->16
                  -- GENERATED --
              */
          