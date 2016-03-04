
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showPicture_Scope0 {
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

class showPicture extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<img src=""""),_display_(/*2.12*/routes/*2.18*/.Application.getPicture(email)),format.raw/*2.48*/(""""/>"""))
      }
    }
  }

  def render(email:String): play.twirl.api.HtmlFormat.Appendable = apply(email)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (email) => apply(email)

  def ref: this.type = this

}


}

/**/
object showPicture extends showPicture_Scope0.showPicture
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:59 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/showPicture.scala.html
                  HASH: 4c954619b1e9a7a26cd837e6bc6fb385f38244e6
                  MATRIX: 757->1|867->16|895->18|932->29|946->35|996->65
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2
                  -- GENERATED --
              */
          