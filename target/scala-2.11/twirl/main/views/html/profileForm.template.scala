
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profileForm_Scope0 {
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

     object profileForm_Scope1 {
import play.data.Form

class profileForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Member],Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(mydick: Form[models.Member], m:Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.41*/("""


"""),format.raw/*5.1*/("""<!---profiles page gets rendered with users profile text or as an input form, update button redirects to the same--->
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Edit Profile</title>
    <!--<link rel="stylesheet" href="profile.css" />-->
    <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*13.35*/routes/*13.41*/.Assets.versioned("stylesheets/material.min.css")),format.raw/*13.90*/(""""/>
    <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
    <link rel="import" href="bower_components/paper-button/paper-button.html">
    <link rel="import" href="bower_components/paper-input/paper-input.html">
</head>

<body>
<!-- The drawer is always open in large screens. The header is always shown,
  even in small screens. -->
<style>
    body  """),format.raw/*24.11*/("""{"""),format.raw/*24.12*/("""
        """),format.raw/*25.9*/("""background-image: url(""""),_display_(/*25.33*/routes/*25.39*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*25.90*/("""");
        background-size: cover;
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""

    """),format.raw/*29.5*/(""".demo-card-wide.mdl-card """),format.raw/*29.30*/("""{"""),format.raw/*29.31*/("""
    """),format.raw/*30.5*/("""width: 512px;
    margin: 0 auto;
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""
    """),format.raw/*33.5*/(""".demo-card-wide > .mdl-card__title """),format.raw/*33.40*/("""{"""),format.raw/*33.41*/("""
    """),format.raw/*34.5*/("""color:  #fff;
    height: 176px;
    background-color: #4a6a85
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/(""".demo-card-wide > .mdl-card__title ul """),format.raw/*38.43*/("""{"""),format.raw/*38.44*/("""
    """),format.raw/*39.5*/("""list-style-type: none;
    columns: 2;
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
    """),format.raw/*42.5*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*42.39*/("""{"""),format.raw/*42.40*/("""
    """),format.raw/*43.5*/("""color: #fff;
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""
    """),format.raw/*45.5*/(""".mdl-textfield  """),format.raw/*45.21*/("""{"""),format.raw/*45.22*/("""
    """),format.raw/*46.5*/("""margin-left:0px;
    color:#0a2f4e;
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
    """),format.raw/*49.5*/(""".form"""),format.raw/*49.10*/("""{"""),format.raw/*49.11*/("""
    """),format.raw/*50.5*/("""padding: 30px;
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""


"""),format.raw/*54.1*/("""</style>

    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer">
        <div class="mdl-layout__drawer">
            <span class="mdl-layout-title">Navigation</span>
            <nav class="mdl-navigation">
                    <!---add navigation to form input here--->
                    <!---edit button opens s form inside tha card that can then be saved--->

                <a class="mdl-navigation__link" href=""""),_display_(/*63.56*/routes/*63.62*/.Application.profile()),format.raw/*63.84*/("""">View Profile</a>
                <a class="mdl-navigation__link" href=""""),_display_(/*64.56*/routes/*64.62*/.Application.uploadPicture()),format.raw/*64.90*/("""">Upload a Profile Picture</a>
                <a class="mdl-navigation__link" href=""""),_display_(/*65.56*/routes/*65.62*/.Application.search()),format.raw/*65.83*/("""">Search</a>
                <a class="mdl-navigation__link" href=""""),_display_(/*66.56*/routes/*66.62*/.Application.logout()),format.raw/*66.83*/("""">Logout</a>
            </nav>
        </div>
        <main class="mdl-layout__content">
            <div class="page-content">
                <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                    <div class = "form">
                            <!---check if the form is null, null form takes you to an update page--->
                            <!--- form will save everything--->

                        <form action="/updateProfile" method="POST" >
                            <input type="hidden" name="email" id="email" value=""""),_display_(/*77.82*/m/*77.83*/.getEmail()),format.raw/*77.94*/("""">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="firstName" name="firstName" value=""""),_display_(/*79.121*/m/*79.122*/.getFirstName()),format.raw/*79.137*/("""">
                                <label class="mdl-textfield__label" for="firstName">First Name*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="lastName" name="lastName" value=""""),_display_(/*83.119*/m/*83.120*/.getLastName()),format.raw/*83.134*/("""">
                                <label class="mdl-textfield__label" for="lastName">Last Name*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="password" id="password" name="password" value=""""),_display_(/*87.123*/m/*87.124*/.getPassword()),format.raw/*87.138*/("""">
                                <label class="mdl-textfield__label" for="password">Password*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="gradYear" name="gradYear" pattern="-?[0-9]*(\.[0-9]+)?" value=""""),_display_(/*91.149*/m/*91.150*/.getGradYear()),format.raw/*91.164*/("""">
                                <label class="mdl-textfield__label" for="gradYear">Graduation Year</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="major" name="major" value=""""),_display_(/*95.113*/m/*95.114*/.getMajor()),format.raw/*95.125*/("""">
                                <label class="mdl-textfield__label" for="major">Major</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="secondMajor" name="secondMajor" value=""""),_display_(/*99.125*/m/*99.126*/.getSecondMajor()),format.raw/*99.143*/("""">
                                <label class="mdl-textfield__label" for="secondMajor">Second Major</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="PID" name="PID" value=""""),_display_(/*103.109*/m/*103.110*/.getPID()),format.raw/*103.119*/("""">
                                <label class="mdl-textfield__label" for="PID">PID</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <textarea class="mdl-textfield__input" type="text" rows= "5" id="blurb" name="blurb"
                                style="font-family:Helvetica,Arial,sans-serif">"""),_display_(/*108.81*/m/*108.82*/.getBlurb()),format.raw/*108.93*/("""</textarea>
                                <label class="mdl-textfield__label" for="blurb">Write a short blurb...</label>
                            </div>

                                <!--- picture is stored as an image id, need a seperate form to upload images--->

                            <br> <br> <br>

                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit" style="border : 10 px ;">
                                Save changes
                            </button>
                        </form>
                    </div>
                </div>
            </div>

            """),_display_(/*124.14*/footer()),format.raw/*124.22*/("""
        """),format.raw/*125.9*/("""</main>

    </div>

</body>

</html>"""))
      }
    }
  }

  def render(mydick:Form[models.Member],m:Member): play.twirl.api.HtmlFormat.Appendable = apply(mydick,m)

  def f:((Form[models.Member],Member) => play.twirl.api.HtmlFormat.Appendable) = (mydick,m) => apply(mydick,m)

  def ref: this.type = this

}


}
}

/**/
object profileForm extends profileForm_Scope0.profileForm_Scope1.profileForm
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/profileForm.scala.html
                  HASH: 2b8a62da2caf24164ddd7349506da5059c387b40
                  MATRIX: 833->25|967->64|999->70|1465->509|1480->515|1550->564|2077->1063|2106->1064|2143->1074|2194->1098|2209->1104|2281->1155|2350->1197|2378->1198|2413->1206|2466->1231|2495->1232|2528->1238|2595->1278|2623->1279|2656->1285|2719->1320|2748->1321|2781->1327|2878->1397|2906->1398|2939->1404|3005->1442|3034->1443|3067->1449|3139->1494|3167->1495|3200->1501|3262->1535|3291->1536|3324->1542|3369->1560|3397->1561|3430->1567|3474->1583|3503->1584|3536->1590|3605->1632|3633->1633|3666->1639|3699->1644|3728->1645|3761->1651|3808->1671|3836->1672|3869->1678|4338->2120|4353->2126|4396->2148|4498->2223|4513->2229|4562->2257|4676->2344|4691->2350|4733->2371|4829->2440|4844->2446|4886->2467|5482->3036|5492->3037|5524->3048|5780->3276|5791->3277|5828->3292|6223->3659|6234->3660|6270->3674|6667->4043|6678->4044|6714->4058|7136->4452|7147->4453|7183->4467|7575->4831|7586->4832|7619->4843|8010->5206|8021->5207|8060->5224|8449->5584|8461->5585|8493->5594|8954->6027|8965->6028|8998->6039|9707->6720|9737->6728|9775->6738
                  LINES: 30->2|35->2|38->5|46->13|46->13|46->13|57->24|57->24|58->25|58->25|58->25|58->25|60->27|60->27|62->29|62->29|62->29|63->30|65->32|65->32|66->33|66->33|66->33|67->34|70->37|70->37|71->38|71->38|71->38|72->39|74->41|74->41|75->42|75->42|75->42|76->43|77->44|77->44|78->45|78->45|78->45|79->46|81->48|81->48|82->49|82->49|82->49|83->50|84->51|84->51|87->54|96->63|96->63|96->63|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|110->77|110->77|110->77|112->79|112->79|112->79|116->83|116->83|116->83|120->87|120->87|120->87|124->91|124->91|124->91|128->95|128->95|128->95|132->99|132->99|132->99|136->103|136->103|136->103|141->108|141->108|141->108|157->124|157->124|158->125
                  -- GENERATED --
              */
          