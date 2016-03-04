
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newStudentMember_Scope0 {
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

     object newStudentMember_Scope1 {
import play.data.Form

class newStudentMember extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm:Form[models.Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""
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
        <style>
        body  """),format.raw/*20.15*/("""{"""),format.raw/*20.16*/("""
        """),format.raw/*21.9*/("""background-image: url(""""),_display_(/*21.33*/routes/*21.39*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*21.90*/("""");
        background-size: cover;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        """),format.raw/*24.9*/(""".demo-card-wide.mdl-card """),format.raw/*24.34*/("""{"""),format.raw/*24.35*/("""
        """),format.raw/*25.9*/("""width: 512px;
        margin: 0 auto;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/(""".demo-card-wide > .mdl-card__title """),format.raw/*28.44*/("""{"""),format.raw/*28.45*/("""
        """),format.raw/*29.9*/("""color:  #fff;
        height: 176px;
        background-color: #4a6a85
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
        """),format.raw/*33.9*/(""".demo-card-wide > .mdl-card__title ul """),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""
        """),format.raw/*34.9*/("""list-style-type: none;
        columns: 2;
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
        """),format.raw/*37.9*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
        """),format.raw/*38.9*/("""color: #fff;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/(""".mdl-textfield  """),format.raw/*40.25*/("""{"""),format.raw/*40.26*/("""
        """),format.raw/*41.9*/("""margin-left:0px;
        color:#0a2f4e;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        """),format.raw/*44.9*/(""".form"""),format.raw/*44.14*/("""{"""),format.raw/*44.15*/("""
        """),format.raw/*45.9*/("""padding: 30px;
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        """),format.raw/*47.9*/("""</style>

        <div class="mdl-layout mdl-js-layout">
            <header class="mdl-layout__header">
                <div class="mdl-layout__header-row" style="color:white; font-weight:bold;">
                    YConnect Registration
                </div>
            </header>

            <main class="mdl-layout__content">
                <div class="page-content">
                    <div class="form demo-card-wide mdl-card mdl-shadow--2dp">
                            <!---check if the form is null, null form takes you to an update page--->
                            <!--- form will save everything--->
                            <!--- multipart form input --->
                            <!---mom went to same school and didn't complain nearly as much...--->
                        """),_display_(/*63.26*/if(studentForm.hasErrors)/*63.51*/ {_display_(Seq[Any](format.raw/*63.53*/("""
                            """),format.raw/*64.29*/("""<div class="alert alert-error" style="color:red;">
                                Please fill out all required forms (*).
                            </div>
                        """)))}),format.raw/*67.26*/("""
                        """),_display_(/*68.26*/helper/*68.32*/.form(action = routes.Application.saveNewMember())/*68.82*/ {_display_(Seq[Any](format.raw/*68.84*/("""

                            """),format.raw/*70.29*/("""<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="firstName" name="firstName" >
                                <label class="mdl-textfield__label" for="firstName">First Name*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="lastName" name="lastName" >
                                <label class="mdl-textfield__label" for="lastName">Last Name*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="email" id="email" name="email" >
                                <label class="mdl-textfield__label" for="email">Email Address*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="password" id="password" name="password" >
                                <label class="mdl-textfield__label" for="password">Password*</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="gradYear" name="gradYear" pattern="-?[0-9]*(\.[0-9]+)?">
                                <label class="mdl-textfield__label" for="gradYear">Graduation Year</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="major" name="major">
                                <label class="mdl-textfield__label" for="major">Major</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="secondMajor" name="secondMajor">
                                <label class="mdl-textfield__label" for="secondMajor">Second Major</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <input class="mdl-textfield__input" type="text" id="PID" name="PID">
                                <label class="mdl-textfield__label" for="PID">PID</label>
                            </div>
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                <textarea class="mdl-textfield__input" type="text" rows= "5" id="blurb" name="blurb" ></textarea>
                                <label class="mdl-textfield__label" for="blurb">Write a short blurb...</label>
                            </div>

                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit" name="send" style="border:10px;">
                                Submit
                            </button>
                        """)))}),format.raw/*110.26*/("""
                    """),format.raw/*111.21*/("""</div>
                </div>
                """),_display_(/*113.18*/footer()),format.raw/*113.26*/("""
            """),format.raw/*114.13*/("""</main>
        </div>

    </body>

</html>"""))
      }
    }
  }

  def render(studentForm:Form[models.Member]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)

  def f:((Form[models.Member]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => apply(studentForm)

  def ref: this.type = this

}


}
}

/**/
object newStudentMember extends newStudentMember_Scope0.newStudentMember_Scope1.newStudentMember
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:58 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/newStudentMember.scala.html
                  HASH: 33b0f8c9069554988e043487a58920d73936e54d
                  MATRIX: 841->25|969->58|997->60|1492->528|1507->534|1577->583|2032->1010|2061->1011|2098->1021|2149->1045|2164->1051|2236->1102|2309->1148|2338->1149|2375->1159|2428->1184|2457->1185|2494->1195|2569->1243|2598->1244|2635->1254|2698->1289|2727->1290|2764->1300|2873->1382|2902->1383|2939->1393|3005->1431|3034->1432|3071->1442|3151->1495|3180->1496|3217->1506|3279->1540|3308->1541|3345->1551|3394->1573|3423->1574|3460->1584|3504->1600|3533->1601|3570->1611|3647->1661|3676->1662|3713->1672|3746->1677|3775->1678|3812->1688|3863->1712|3892->1713|3929->1723|4776->2543|4810->2568|4850->2570|4908->2600|5125->2786|5179->2813|5194->2819|5253->2869|5293->2871|5353->2903|8861->6379|8912->6401|8989->6450|9019->6458|9062->6472
                  LINES: 30->2|35->2|36->3|44->11|44->11|44->11|53->20|53->20|54->21|54->21|54->21|54->21|56->23|56->23|57->24|57->24|57->24|58->25|60->27|60->27|61->28|61->28|61->28|62->29|65->32|65->32|66->33|66->33|66->33|67->34|69->36|69->36|70->37|70->37|70->37|71->38|72->39|72->39|73->40|73->40|73->40|74->41|76->43|76->43|77->44|77->44|77->44|78->45|79->46|79->46|80->47|96->63|96->63|96->63|97->64|100->67|101->68|101->68|101->68|101->68|103->70|143->110|144->111|146->113|146->113|147->114
                  -- GENERATED --
              */
          