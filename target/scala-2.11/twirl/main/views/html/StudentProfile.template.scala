
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object StudentProfile_Scope0 {
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

     object StudentProfile_Scope1 {
import play.data.Form

class StudentProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(member: Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.18*/("""
"""),format.raw/*3.1*/("""<!---profiles page gets rendered with users profile text or as an input form, update button redirects to the same--->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Campus Y User</title>
            <!--<link rel="stylesheet" href="profile.css" />-->
        <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("stylesheets/material.min.css")),format.raw/*11.94*/(""""/>
        <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
        <link rel="import" href="bower_components/paper-button/paper-button.html">
        <link rel="import" href="bower_components/paper-input/paper-input.html">
    </head>

    <body>
            <!-- The drawer is always open in large screens. The header is always shown,
  even in small screens. -->
        <style>
        body  """),format.raw/*22.15*/("""{"""),format.raw/*22.16*/("""
        """),format.raw/*23.9*/("""background-image: url(""""),_display_(/*23.33*/routes/*23.39*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*23.90*/("""");
        background-size: cover;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""

        """),format.raw/*27.9*/(""".demo-card-wide.mdl-card """),format.raw/*27.34*/("""{"""),format.raw/*27.35*/("""
        """),format.raw/*28.9*/("""width: 512px;
        margin: 0 auto;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        """),format.raw/*31.9*/(""".demo-card-wide > .mdl-card__title """),format.raw/*31.44*/("""{"""),format.raw/*31.45*/("""
        """),format.raw/*32.9*/("""color:  #fff;
        height: 146px;
        background-color:#4a6a85;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        """),format.raw/*36.9*/(""".demo-card-wide > .mdl-card__title ul """),format.raw/*36.47*/("""{"""),format.raw/*36.48*/("""
        """),format.raw/*37.9*/("""list-style-type: none;
        columns: 2;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*40.43*/("""{"""),format.raw/*40.44*/("""
        """),format.raw/*41.9*/("""color: #fff;
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
        """),format.raw/*43.9*/(""".profilepic """),format.raw/*43.21*/("""{"""),format.raw/*43.22*/("""
            """),format.raw/*44.13*/("""height:126px;
            width:126px;
            border-radius:126px;
            background-clip: padding-box;
            background-size: cover;
            position: absolute;
            top: 10px;
            right: 10px;
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""


        """),format.raw/*55.9*/("""</style>

        <div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer">
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Navigation</span>
                <nav class="mdl-navigation">
                        <!---add navigation to form input here--->
                        <!---edit button opens s form inside tha card that can then be saved--->

                    <a class="mdl-navigation__link" href=""""),_display_(/*64.60*/routes/*64.66*/.Application.updateProfile()),format.raw/*64.94*/("""">Edit Profile</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*65.60*/routes/*65.66*/.Application.uploadPicture()),format.raw/*65.94*/("""">
                        Upload a Profile Picture</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*67.60*/routes/*67.66*/.Application.search()),format.raw/*67.87*/("""">Search</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*68.60*/routes/*68.66*/.Application.logout()),format.raw/*68.87*/("""">Logout</a>
                </nav>
            </div>
            <main class="mdl-layout__content">
                <div class="page-content">
                    <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title">
                            <div class = "headerinfo mdl-card__title-text">
                                """),_display_(/*76.34*/member/*76.40*/.getFirstName()),format.raw/*76.55*/(""" """),_display_(/*76.57*/member/*76.63*/.getLastName()),format.raw/*76.77*/("""

                            """),format.raw/*78.29*/("""</div>
                            <div class = "profilepic" style="background-image:url("""),_display_(/*79.84*/routes/*79.90*/.Application.getPicture(member.getEmail())),format.raw/*79.132*/(""")"></div>
                        </div>

                            <!--- we were supplied a user, so render his/her info--->
                        <div class="mdl-card__supporting-text">
                            """),_display_(/*84.30*/personalinfo(member)),format.raw/*84.50*/("""
                        """),format.raw/*85.25*/("""</div>
                        <div class="mdl-card__actions mdl-card--border">
                            <a href="mailto:"""),_display_(/*87.46*/member/*87.52*/.getEmail()),format.raw/*87.63*/("""?Subject=Yconnect" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                Email """),_display_(/*88.40*/member/*88.46*/.getFirstName()),format.raw/*88.61*/("""
                            """),format.raw/*89.29*/("""</a>
                        </div>
                    </div>
                </div>


                """),_display_(/*95.18*/footer()),format.raw/*95.26*/("""
            """),format.raw/*96.13*/("""</main>
        </div>

    </body>

</html>"""))
      }
    }
  }

  def render(member:Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


}
}

/**/
object StudentProfile extends StudentProfile_Scope0.StudentProfile_Scope1.StudentProfile
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:59 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/StudentProfile.scala.html
                  HASH: 1bcd17dc6fe5ed4e14a0e1ee2ea852e2d4cadfff
                  MATRIX: 822->25|933->41|961->43|1456->511|1471->517|1541->566|2116->1113|2145->1114|2182->1124|2233->1148|2248->1154|2320->1205|2393->1251|2422->1252|2461->1264|2514->1289|2543->1290|2580->1300|2655->1348|2684->1349|2721->1359|2784->1394|2813->1395|2850->1405|2959->1487|2988->1488|3025->1498|3091->1536|3120->1537|3157->1547|3237->1600|3266->1601|3303->1611|3365->1645|3394->1646|3431->1656|3480->1678|3509->1679|3546->1689|3586->1701|3615->1702|3657->1716|3930->1962|3959->1963|4000->1977|4497->2447|4512->2453|4561->2481|4667->2560|4682->2566|4731->2594|4875->2711|4890->2717|4932->2738|5032->2811|5047->2817|5089->2838|5506->3228|5521->3234|5557->3249|5586->3251|5601->3257|5636->3271|5696->3303|5814->3394|5829->3400|5893->3442|6146->3668|6187->3688|6241->3714|6395->3841|6410->3847|6442->3858|6603->3992|6618->3998|6654->4013|6712->4043|6850->4154|6879->4162|6921->4176
                  LINES: 30->2|35->2|36->3|44->11|44->11|44->11|55->22|55->22|56->23|56->23|56->23|56->23|58->25|58->25|60->27|60->27|60->27|61->28|63->30|63->30|64->31|64->31|64->31|65->32|68->35|68->35|69->36|69->36|69->36|70->37|72->39|72->39|73->40|73->40|73->40|74->41|75->42|75->42|76->43|76->43|76->43|77->44|85->52|85->52|88->55|97->64|97->64|97->64|98->65|98->65|98->65|100->67|100->67|100->67|101->68|101->68|101->68|109->76|109->76|109->76|109->76|109->76|109->76|111->78|112->79|112->79|112->79|117->84|117->84|118->85|120->87|120->87|120->87|121->88|121->88|121->88|122->89|128->95|128->95|129->96
                  -- GENERATED --
              */
          