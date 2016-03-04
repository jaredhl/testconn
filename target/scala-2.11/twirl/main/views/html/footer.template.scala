
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- Put this footer at the bottom, but INSIDE, of div class "main" -->
<style>
/* needed to make footer stay at bottom */
.mdl-layout__content """),format.raw/*4.22*/("""{"""),format.raw/*4.23*/("""
"""),format.raw/*5.1*/("""display: -webkit-flex;
display: flex;
-webkit-flex-direction: column;
flex-direction: column;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""</style>

<div class="mdl-layout-spacer"></div>
<footer class="mdl-mini-footer" style="padding-top: 5px; padding-bottom: 5px; background-color:#b5bfc8;">
    <div class="mdl-mini-footer__left-section">
        <div class="mdl-logo" style="color:#0a2f4e">YConnect 2015</div>
        <ul class="mdl-mini-footer__link-list" style="color:#0a2f4e">
            <li><a href="http://lmgtfy.com/?q=help">Help</a></li>
            <li><a href="http://lmgtfy.com/?q=privacy">Privacy & Terms</a></li>
        </ul>
    </div>
</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/footer.scala.html
                  HASH: 585081621c2e96510e69d23594126c62c2168125
                  MATRIX: 829->0|1003->147|1031->148|1059->150|1183->248|1210->249
                  LINES: 32->1|35->4|35->4|36->5|40->9|40->9
                  -- GENERATED --
              */
          