
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadPicture_Scope0 {
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

class uploadPicture extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Image],Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sendImage:Form[Image], member: Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

    """),format.raw/*3.5*/("""<!---profiles page gets rendered with users profile text or as an input form, update button redirects to the same--->
    <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Upload Image</title>
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
        body  """),format.raw/*23.15*/("""{"""),format.raw/*23.16*/("""
        """),format.raw/*24.9*/("""background-image: url(""""),_display_(/*24.33*/routes/*24.39*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*24.90*/("""");
        background-size: cover;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""

        """),format.raw/*28.9*/(""".demo-card-image.mdl-card """),format.raw/*28.35*/("""{"""),format.raw/*28.36*/("""
            """),format.raw/*29.13*/("""width: 400px;
            height: 400px;
            background: url("""),_display_(/*31.30*/routes/*31.36*/.Application.getPicture(member.getEmail())),format.raw/*31.78*/(""") center / cover;
            margin: auto;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        """),format.raw/*34.9*/(""".mdl-card__actions"""),format.raw/*34.27*/("""{"""),format.raw/*34.28*/("""
            """),format.raw/*35.13*/("""background:rgba(0, 0, 0, .5);
            color:white;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</style>

        <div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer">
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Navigation</span>
                <nav class="mdl-navigation">
                        <!---add navigation to form input here--->
                        <!---edit button opens s form inside tha card that can then be saved--->
                    <a class="mdl-navigation__link" href=""""),_display_(/*46.60*/routes/*46.66*/.Application.profile()),format.raw/*46.88*/("""">View Profile</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*47.60*/routes/*47.66*/.Application.updateProfile()),format.raw/*47.94*/("""">Edit Profile</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*48.60*/routes/*48.66*/.Application.search()),format.raw/*48.87*/("""">Search</a>
                    <a class="mdl-navigation__link" href=""""),_display_(/*49.60*/routes/*49.66*/.Application.logout()),format.raw/*49.87*/("""">Logout</a>
                </nav>
            </div>
            <main class="mdl-layout__content">
                <div class="page-content">


   """),format.raw/*56.63*/("""

                    """),format.raw/*58.21*/("""<div class="demo-card-image mdl-card mdl-shadow--2dp">
                        <div class="mdl-card__title mdl-card--expand"></div>
                        <div class="mdl-card__actions mdl-card--border">
                        <form action="/image" method="POST" enctype="multipart/form-data">
                            <input type="file" name="pic" id="pic">
                            <input type="submit" value="Upload">
                        </form>
                        </div>
                    </div>

                </div>
                """),_display_(/*69.18*/footer()),format.raw/*69.26*/("""
            """),format.raw/*70.13*/("""</main>
        </div>

    </body>

</html>"""))
      }
    }
  }

  def render(sendImage:Form[Image],member:Member): play.twirl.api.HtmlFormat.Appendable = apply(sendImage,member)

  def f:((Form[Image],Member) => play.twirl.api.HtmlFormat.Appendable) = (sendImage,member) => apply(sendImage,member)

  def ref: this.type = this

}


}

/**/
object uploadPicture extends uploadPicture_Scope0.uploadPicture
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:59 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/uploadPicture.scala.html
                  HASH: 6ec210eaa4d1836003b5a35894e5753e088a7649
                  MATRIX: 773->1|907->40|941->48|1439->519|1454->525|1524->574|2101->1123|2130->1124|2167->1134|2218->1158|2233->1164|2305->1215|2378->1261|2407->1262|2446->1274|2500->1300|2529->1301|2571->1315|2670->1387|2685->1393|2748->1435|2829->1489|2858->1490|2895->1500|2941->1518|2970->1519|3012->1533|3104->1598|3133->1599|3170->1609|3665->2077|3680->2083|3723->2105|3829->2184|3844->2190|3893->2218|3999->2297|4014->2303|4056->2324|4156->2397|4171->2403|4213->2424|4398->2640|4450->2664|5048->3235|5077->3243|5119->3257
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|54->23|54->23|55->24|55->24|55->24|55->24|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|62->31|64->33|64->33|65->34|65->34|65->34|66->35|68->37|68->37|69->38|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|87->56|89->58|100->69|100->69|101->70
                  -- GENERATED --
              */
          