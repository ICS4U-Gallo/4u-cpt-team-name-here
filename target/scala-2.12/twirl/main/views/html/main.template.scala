
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),format.raw/*15.62*/("""
        """),format.raw/*16.9*/("""<title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*18.107*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/fa-svg-with-js.css")),format.raw/*19.111*/("""">
        <script defer src=""""),_display_(/*20.29*/routes/*20.35*/.Assets.versioned("javascripts/fontawesome-all.js")),format.raw/*20.86*/(""""></script>

    </head>
    <body>
        <div class="container">
            """),format.raw/*26.36*/("""
            """),_display_(/*27.14*/content),format.raw/*27.21*/("""
        """),format.raw/*28.9*/("""</div>

        <script type='text/javascript' src='"""),_display_(/*30.46*/routes/*30.52*/.Assets.versioned("javascripts/jquery-3.3.1.js")),format.raw/*30.100*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*31.46*/routes/*31.52*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*31.97*/("""'></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 16 00:36:14 EDT 2018
                  SOURCE: C:/Users/doubleAbatteryman/Abtin/4u-cpt-team-name-here/app/views/main.scala.html
                  HASH: 99d039f15bbf19400ff84af591f22c404d3ddf43
                  MATRIX: 1211->266|1336->296|1366->300|1561->520|1598->530|1633->538|1659->543|1754->611|1769->617|1830->656|1915->714|1930->720|1998->766|2082->823|2097->829|2170->880|2229->912|2244->918|2316->969|2429->1149|2471->1164|2499->1171|2536->1181|2618->1236|2633->1242|2703->1290|2788->1348|2803->1354|2869->1399
                  LINES: 33->7|38->7|40->9|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|56->26|57->27|57->27|58->28|60->30|60->30|60->30|61->31|61->31|61->31
                  -- GENERATED --
              */
          