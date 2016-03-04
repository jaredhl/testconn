
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginAlt_Scope0 {
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

class loginAlt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[controllers.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[controllers.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),_display_(/*2.2*/helper/*2.8*/.form(routes.Application.authenticateLogin())/*2.53*/ {_display_(Seq[Any](format.raw/*2.55*/("""
    """),format.raw/*3.5*/("""<h1>Sign in</h1>

    <p>
        <input type="email" name="email" placeholder="Email" value=""""),_display_(/*6.70*/form("email")/*6.83*/.value),format.raw/*6.89*/("""">
    </p>
    <p>
        <input type="password" name="password" placeholder="Password">
    </p>
    <p>
        <button type="submit">Login</button>
    </p>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(form:play.data.Form[controllers.Login]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[controllers.Login]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object loginAlt extends loginAlt_Scope0.loginAlt
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/loginAlt.scala.html
                  HASH: 43ffacc6e2255808293b93aef7228f1f9ed4a84e
                  MATRIX: 778->1|914->42|942->45|955->51|1008->96|1047->98|1079->104|1203->202|1224->215|1250->221|1451->392
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|37->6|37->6|37->6|45->14
                  -- GENERATED --
              */
          