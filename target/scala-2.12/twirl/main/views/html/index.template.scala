
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Equation Solver")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Equation Solver</h1>
  <a href=""""),_display_(/*5.13*/routes/*5.19*/.MenuController.index()),format.raw/*5.42*/("""">Menu</a>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 12:24:18 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/index.scala.html
                  HASH: 980e6ec6d632a2243166e9247c90fd743a360b71
                  MATRIX: 941->1|1037->3|1067->8|1098->31|1137->33|1167->37|1231->75|1245->81|1288->104|1330->117
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6
                  -- GENERATED --
              */
          