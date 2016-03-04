
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object personalinfo_Scope0 {
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

class personalinfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(member: Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!-- This file is the standard for personal info display. Edit here and it will change everywhere. -->
<style>
    /*no style elements required for now

</style>
<div id="PersonalInfoText">
    <p>Class of """),_display_(/*8.18*/member/*8.24*/.getGradYear()),format.raw/*8.38*/("""<br>
        """),_display_(/*9.10*/if(member.getMajor != "" && member.getMajor != null)/*9.62*/ {_display_(Seq[Any](format.raw/*9.64*/("""Majoring in """),_display_(/*9.77*/member/*9.83*/.getMajor()),format.raw/*9.94*/(""" """),_display_(/*9.96*/if(member.getSecondMajor != "" && member.getSecondMajor != null)/*9.160*/{_display_(Seq[Any](format.raw/*9.161*/(""" """),format.raw/*9.162*/("""and """),_display_(/*9.167*/member/*9.173*/.getSecondMajor())))})))}),format.raw/*9.192*/("""<br>
        """),_display_(/*10.10*/member/*10.16*/.getEmail()),format.raw/*10.27*/("""
                                """),format.raw/*11.33*/("""</p>
</div>
<div id="Blurb">
    <p>"""),_display_(/*14.9*/member/*14.15*/.getBlurb()),format.raw/*14.26*/("""</p>
</div>"""))
      }
    }
  }

  def render(member:Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


}

/**/
object personalinfo extends personalinfo_Scope0.personalinfo
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/personalinfo.scala.html
                  HASH: bb955e5f81e245df82fab92f2e01976070725b9e
                  MATRIX: 759->1|870->17|898->19|1137->232|1151->238|1185->252|1226->267|1286->319|1325->321|1364->334|1378->340|1409->351|1437->353|1510->417|1549->418|1578->419|1610->424|1625->430|1671->449|1713->464|1728->470|1760->481|1822->515|1888->555|1903->561|1935->572
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|45->14|45->14|45->14
                  -- GENERATED --
              */
          