
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

object linear extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[equation[Linear, <error>],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(equation : Linear equation):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*3.2*/main("Solve M")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Solve M</h1>
    """),_display_(/*5.6*/helper/*5.12*/.input),format.raw/*5.18*/("""
""")))}))
      }
    }
  }

  def render(equation:equation[Linear, <error>]): play.twirl.api.HtmlFormat.Appendable = apply(equation)

  def f:((equation[Linear, <error>]) => play.twirl.api.HtmlFormat.Appendable) = (equation) => apply(equation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 13:23:17 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/Menu/linear.scala.html
                  HASH: cfa5643b68784d4ed1ab4b07b2e4de6ad640cb29
                  MATRIX: 973->1|1074->32|1119->29|1147->50|1170->65|1209->67|1241->73|1289->96|1303->102|1329->108
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5
                  -- GENERATED --
              */
          