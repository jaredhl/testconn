
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myFieldConstructorTemplate_Scope0 {
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

class myFieldConstructorTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<div class=""""),_display_(/*3.14*/if(elements.hasErrors)/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""error""")))}),format.raw/*3.44*/("""">
    <label for=""""),_display_(/*4.18*/elements/*4.26*/.id),format.raw/*4.29*/("""">"""),_display_(/*4.32*/elements/*4.40*/.label),format.raw/*4.46*/("""</label>
    <div class="input">
        """),_display_(/*6.10*/elements/*6.18*/.input),format.raw/*6.24*/("""
        """),format.raw/*7.9*/("""<span class="errors">"""),_display_(/*7.31*/elements/*7.39*/.errors.mkString(", ")),format.raw/*7.61*/("""</span>
        <span class="help">"""),_display_(/*8.29*/elements/*8.37*/.infos.mkString(", ")),format.raw/*8.58*/("""</span>
    </div>
</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object myFieldConstructorTemplate extends myFieldConstructorTemplate_Scope0.myFieldConstructorTemplate
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/myFieldConstructorTemplate.scala.html
                  HASH: 556373f627b95cba3153f88fb47e669bcd2e732d
                  MATRIX: 801->1|928->33|958->37|997->50|1027->72|1066->74|1102->80|1149->101|1165->109|1188->112|1217->115|1233->123|1259->129|1329->173|1345->181|1371->187|1407->197|1455->219|1471->227|1513->249|1576->286|1592->294|1633->315
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8
                  -- GENERATED --
              */
          