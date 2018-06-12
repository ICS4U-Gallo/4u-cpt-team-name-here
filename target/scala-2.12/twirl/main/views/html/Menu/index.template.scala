
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/main("Menu")/*2.14*/{_display_(Seq[Any](format.raw/*2.15*/("""
    """),format.raw/*3.5*/("""<h1>Menu</h1>
    <a href""""),_display_(/*4.14*/routes/*4.20*/.MenuController.linear),format.raw/*4.42*/("""">Linear<a/>

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
                  DATE: Mon Jun 11 13:15:18 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Menu/index.scala.html
                  HASH: 82c880ceb93b4daeac5e78ab72f2870c4ed36810
                  MATRIX: 946->1|1042->3|1070->6|1090->18|1128->19|1160->25|1214->53|1228->59|1270->81|1316->98
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4|36->4|38->6
                  -- GENERATED --
              */
          