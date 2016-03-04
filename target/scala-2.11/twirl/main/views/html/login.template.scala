
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[controllers.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[controllers.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>Log into YConnect</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*5.59*/routes/*5.65*/.Assets.versioned("images/favicon.png")),format.raw/*5.104*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*6.70*/routes/*6.76*/.Assets.versioned("stylesheets/login.css")),format.raw/*6.118*/("""">
        <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/material.min.css")),format.raw/*8.94*/(""""/>
        <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
        <link rel="import" href="bower_components/paper-button/paper-button.html">
        <link rel="import" href="bower_components/paper-input/paper-input.html">
    </head>
    <body>
            <!-- Uses a transparent header that draws on top of the layout's background -->
        <style>
        .demo-layout-transparent """),format.raw/*17.34*/("""{"""),format.raw/*17.35*/("""
        """),format.raw/*18.9*/("""background:url('"""),_display_(/*18.26*/routes/*18.32*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*18.83*/("""');background-size: cover;);
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""

        """),format.raw/*21.9*/(""".registerbutton """),format.raw/*21.25*/("""{"""),format.raw/*21.26*/("""
        """),format.raw/*22.9*/("""position:fixed;
        top:20px;
        right:20px;
        color:#ffffff !important;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""

        """),format.raw/*28.9*/(""".loginbutton"""),format.raw/*28.21*/("""{"""),format.raw/*28.22*/("""
        """),format.raw/*29.9*/("""color:#0a2f4e !important;
        margin:auto;
        margin-top:70px;"
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

        """),format.raw/*34.9*/("""</style>

        <div class="demo-layout-transparent mdl-layout mdl-js-layout">

            <main class="mdl-layout__content">
                <div class="page-content">
                    <a class="registerbutton mdl-button mdl-js-button mdl-button--raised mdl-button--colored" href=""""),_display_(/*40.118*/routes/*40.124*/.Application.newMember()),format.raw/*40.148*/("""">
                        Register
                    </a>
                        <!-- Wide card with share menu button -->
                    <style>
                    .demo-card-wide.mdl-card """),format.raw/*45.46*/("""{"""),format.raw/*45.47*/("""
                    """),format.raw/*46.21*/("""width: 700px;
                    margin:auto;
                    position:relative;
                        top: 50px;
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/("""
                    """),format.raw/*51.21*/(""".demo-card-wide > .mdl-card__title """),format.raw/*51.56*/("""{"""),format.raw/*51.57*/("""
                    """),format.raw/*52.21*/("""color: #fff;
                    height: 176px;
                    background: #4a6a85;
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/("""
                    """),format.raw/*56.21*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*56.55*/("""{"""),format.raw/*56.56*/("""
                    """),format.raw/*57.21*/("""color: #fff;
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</style>

                    <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title">
                            <h2 class="mdl-card__title-text">Welcome to YConnect.</h2>
                        </div>

                        <div class="mdl-card__actions mdl-card--border">
                            """),_display_(/*67.30*/helper/*67.36*/.form(routes.Application.authenticateLogin())/*67.81*/ {_display_(Seq[Any](format.raw/*67.83*/("""
                                """),format.raw/*68.33*/("""<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="float:left">
                                    <input class="mdl-textfield__input" type="email" id="email" name="email">
                                    <label class="mdl-textfield__label" for="email">Email</label>
                                </div>
                                <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="float:right">
                                    <input class="mdl-textfield__input" type="password" id="password" name="password" action="submit">
                                    <label class="mdl-textfield__label" for="password">Password</label>
                                </div>

                                <button class="loginbutton mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit">
                                    login
                                </button>

                            """)))}),format.raw/*81.30*/("""
                        """),format.raw/*82.25*/("""</div>
                    </div>
                </div>

            </main>
            """),_display_(/*87.14*/footer()),format.raw/*87.22*/("""
        """),format.raw/*88.9*/("""</div>

    </body>
</html>"""))
      }
    }
  }

  def render(loginForm:play.data.Form[controllers.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((play.data.Form[controllers.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/login.scala.html
                  HASH: a3f4438d2e29d448dc62f764259a81a98e8f9b90
                  MATRIX: 772->1|913->47|941->49|1087->169|1101->175|1161->214|1260->287|1274->293|1337->335|1497->469|1511->475|1580->524|2145->1061|2174->1062|2211->1072|2255->1089|2270->1095|2342->1146|2407->1184|2436->1185|2475->1197|2519->1213|2548->1214|2585->1224|2712->1324|2741->1325|2780->1337|2820->1349|2849->1350|2886->1360|2997->1444|3026->1445|3065->1457|3388->1752|3404->1758|3450->1782|3683->1987|3712->1988|3762->2010|3935->2155|3964->2156|4014->2178|4077->2213|4106->2214|4156->2236|4296->2348|4325->2349|4375->2371|4437->2405|4466->2406|4516->2428|4578->2462|4607->2463|4657->2485|5051->2852|5066->2858|5120->2903|5160->2905|5222->2939|6267->3953|6321->3979|6444->4075|6473->4083|6510->4093
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|39->8|48->17|48->17|49->18|49->18|49->18|49->18|50->19|50->19|52->21|52->21|52->21|53->22|57->26|57->26|59->28|59->28|59->28|60->29|63->32|63->32|65->34|71->40|71->40|71->40|76->45|76->45|77->46|81->50|81->50|82->51|82->51|82->51|83->52|86->55|86->55|87->56|87->56|87->56|88->57|89->58|89->58|90->59|98->67|98->67|98->67|98->67|99->68|112->81|113->82|118->87|118->87|119->88
                  -- GENERATED --
              */
          