
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Member],play.data.Form[controllers.Search],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(membersList: List[Member], searchForm: play.data.Form[controllers.Search]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/(""" """),format.raw/*1.78*/("""<!--- gets rendered with a list from the database --->
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Search for a User</title>
      <!--<link rel="stylesheet" href="profile.css" />-->
    <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/material.min.css")),format.raw/*9.90*/(""""/>
    <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
    <link rel="import" href="bower_components/paper-button/paper-button.html">
    <link rel="import" href="bower_components/paper-input/paper-input.html">

  </head>
  <body>

    <style>
    body  """),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""
    """),format.raw/*20.5*/("""background-image: url(""""),_display_(/*20.29*/routes/*20.35*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*20.86*/("""");
    background-size: cover;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""
    """),format.raw/*23.5*/(""".demo-layout-transparent """),format.raw/*23.30*/("""{"""),format.raw/*23.31*/("""
    """),format.raw/*24.5*/("""background:url('"""),_display_(/*24.22*/routes/*24.28*/.Assets.versioned("images/Campus Y Background.jpg")),format.raw/*24.79*/("""');background-size: cover;)
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""
    """),format.raw/*26.5*/(""".demo-layout-transparent .mdl-layout__header,
    .demo-layout-transparent .mdl-layout__drawer-button """),format.raw/*27.57*/("""{"""),format.raw/*27.58*/("""
    """),format.raw/*28.5*/("""color: ghostwhite;
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""
    """),format.raw/*30.5*/(""".page-content """),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
    """),format.raw/*31.5*/("""min-height: 100vh;
    //background-color: grey;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
    """),format.raw/*34.5*/(""".mdl-textfield """),format.raw/*34.20*/("""{"""),format.raw/*34.21*/("""
    """),format.raw/*35.5*/("""margin-left: 10px;
    width: 95%;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/(""".mdl-textfield__input"""),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
        """),format.raw/*39.9*/("""position: absolute;
        bottom: 0;
        color: #4a6a85;
        border-bottom: solid;
        border-bottom-color: #4a6a85;
        font-size:24px;
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""
    """),format.raw/*46.5*/(""".material-icons """),format.raw/*46.21*/("""{"""),format.raw/*46.22*/("""
    """),format.raw/*47.5*/("""font-size: 48px;
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
    """),format.raw/*49.5*/(""".demo-card-wide.mdl-card """),format.raw/*49.30*/("""{"""),format.raw/*49.31*/("""
      """),format.raw/*50.7*/("""width: 512px;
      margin:auto;
      margin-bottom:20px;
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""
    """),format.raw/*54.5*/(""".demo-card-wide > .mdl-card__title """),format.raw/*54.40*/("""{"""),format.raw/*54.41*/("""
    """),format.raw/*55.5*/("""color: #fff;
    height: 176px;

    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""
    """),format.raw/*59.5*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*59.39*/("""{"""),format.raw/*59.40*/("""
    """),format.raw/*60.5*/("""color: #fff;
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""
    """),format.raw/*62.5*/(""".resulttitle """),format.raw/*62.18*/("""{"""),format.raw/*62.19*/("""
    """),format.raw/*63.5*/("""background-color : #4a6a85 ;
    height: 100px !important;
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""
    """),format.raw/*66.5*/(""".profilepic """),format.raw/*66.17*/("""{"""),format.raw/*66.18*/("""
        """),format.raw/*67.9*/("""height:80px;
        width:80px;
        border-radius:80px;
        background-clip: padding-box;
        background-size: cover;
        position: absolute;
        top: 10px;
        right: 10px;
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""

    """),format.raw/*77.5*/("""</style>

      <div class="demo-layout-transparent mdl-layout mdl-js-layout">
          <header class="mdl-layout__header">
              <div class="mdl-layout__header-row">
                      <!-- Title -->
                  <span class="mdl-layout-title">Navigation</span>
                      <!-- Add spacer, to align navigation to the right -->
                  <div class="mdl-layout-spacer"></div>
                      <!-- Navigation -->
              </div>
          </header>

          <div class="mdl-layout__drawer">
              <span class="mdl-layout-title">Navigation</span>
              <nav class="mdl-navigation">
                  <a class="mdl-navigation__link" href=""""),_display_(/*93.58*/routes/*93.64*/.Application.profile()),format.raw/*93.86*/("""">View Profile</a>
                  <a class="mdl-navigation__link" href=""""),_display_(/*94.58*/routes/*94.64*/.Application.updateProfile()),format.raw/*94.92*/("""">Edit Profile</a>
                  <a class="mdl-navigation__link" href=""""),_display_(/*95.58*/routes/*95.64*/.Application.logout()),format.raw/*95.85*/("""">Logout</a>
              </nav>
          </div>

          <main class="mdl-layout__content">
              <div class="page-content">
                  <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                      <div class="mdl-card__title">
                          <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable
                                     mdl-textfield--floating-label">
                          """),_display_(/*105.28*/helper/*105.34*/.form(routes.Application.search())/*105.68*/ {_display_(Seq[Any](format.raw/*105.70*/("""
                                  """),format.raw/*106.35*/("""<!---search button--->
                              <button class="mdl-button mdl-js-button mdl-button--icon" for="search-expandable2">
                                  <i class="material-icons material-icons.md-dark" style="color: rgba( 0, 0, 0, 0.54 );">
                                      search</i>
                              </button>
                                  <!---end button--->
                              <div class="mdl-textfield__expandable-holder">

                                  <input name="query" class="mdl-textfield__input" type="String" id="search-expandable2" value=""""),_display_(/*114.130*/searchForm("query")/*114.149*/.value),format.raw/*114.155*/("""">
                                  <label class="mdl-textfield__label" for="search-expandable2">
                                      Search User
                                  </label>
                              </div>
                          """)))}),format.raw/*119.28*/("""
                          """),format.raw/*120.27*/("""</div>
                      </div>
                      <div class="mdl-card__supporting-text">
                          Search for a Campus Y member or Alumni.  You can also search by location, experience or other tags associated with users.
                      </div>
                  </div>

                      <!--- cards start here --->
                  """),_display_(/*128.20*/for(member <- membersList) yield /*128.46*/ {_display_(Seq[Any](format.raw/*128.48*/("""
                      """),format.raw/*129.23*/("""<!---render a card for each returned result--->
                  <div class="result demo-card-wide mdl-card mdl-shadow--2dp">
                      <div class="resulttitle mdl-card__title">
                          <div class = "headerinfo mdl-card__title-text">
                              """),_display_(/*133.32*/member/*133.38*/.getFirstName()),format.raw/*133.53*/(""" """),_display_(/*133.55*/member/*133.61*/.getLastName()),format.raw/*133.75*/("""
                          """),format.raw/*134.27*/("""</div>
                          <div class = "profilepic" style="background-image:url("""),_display_(/*135.82*/routes/*135.88*/.Application.getPicture(member.getEmail())),format.raw/*135.130*/(""")"></div>
                      </div>

                          <!--- we were supplied a user, so render his/her info--->
                      <div class="mdl-card__supporting-text">
                      """),_display_(/*140.24*/personalinfo(member)),format.raw/*140.44*/("""
                      """),format.raw/*141.23*/("""</div>
                      <div class="mdl-card__actions mdl-card--border">
                          <a href="mailto:"""),_display_(/*143.44*/member/*143.50*/.getEmail()),format.raw/*143.61*/("""?Subject=Yconnect" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                              Email """),_display_(/*144.38*/member/*144.44*/.getFirstName()),format.raw/*144.59*/("""
                          """),format.raw/*145.27*/("""</a>
                      </div>
                  </div>
                  """)))}),format.raw/*148.20*/("""

              """),format.raw/*150.15*/("""</div>

          </main>

      </div>

  </body>
</html>
"""))
      }
    }
  }

  def render(membersList:List[Member],searchForm:play.data.Form[controllers.Search]): play.twirl.api.HtmlFormat.Appendable = apply(membersList,searchForm)

  def f:((List[Member],play.data.Form[controllers.Search]) => play.twirl.api.HtmlFormat.Appendable) = (membersList,searchForm) => apply(membersList,searchForm)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Fri Mar 04 15:23:59 EST 2016
                  SOURCE: C:/Users/Jared/Documents/CampusY/testconn/app/views/search.scala.html
                  HASH: 79f8e6d3c92a7a78a72d5069c898fedb6e26fe1f
                  MATRIX: 788->1|958->76|986->77|1397->462|1411->468|1480->517|1909->918|1938->919|1971->925|2022->949|2037->955|2109->1006|2174->1044|2202->1045|2235->1051|2288->1076|2317->1077|2350->1083|2394->1100|2409->1106|2481->1157|2541->1190|2569->1191|2602->1197|2733->1300|2762->1301|2795->1307|2846->1331|2874->1332|2907->1338|2949->1352|2978->1353|3011->1359|3093->1414|3121->1415|3154->1421|3197->1436|3226->1437|3259->1443|3327->1484|3355->1485|3388->1491|3437->1512|3466->1513|3503->1523|3695->1688|3723->1689|3756->1695|3800->1711|3829->1712|3862->1718|3911->1740|3939->1741|3972->1747|4025->1772|4054->1773|4089->1781|4182->1847|4210->1848|4243->1854|4306->1889|4335->1890|4368->1896|4435->1936|4463->1937|4496->1943|4558->1977|4587->1978|4620->1984|4665->2002|4693->2003|4726->2009|4767->2022|4796->2023|4829->2029|4921->2094|4949->2095|4982->2101|5022->2113|5051->2114|5088->2124|5326->2335|5354->2336|5389->2344|6134->3062|6149->3068|6192->3090|6296->3167|6311->3173|6360->3201|6464->3278|6479->3284|6521->3305|7012->3768|7028->3774|7072->3808|7113->3810|7178->3846|7824->4463|7854->4482|7883->4488|8176->4749|8233->4777|8639->5155|8682->5181|8723->5183|8776->5207|9104->5507|9120->5513|9157->5528|9187->5530|9203->5536|9239->5550|9296->5578|9413->5667|9429->5673|9494->5715|9736->5929|9778->5949|9831->5973|9982->6096|9998->6102|10031->6113|10191->6245|10207->6251|10244->6266|10301->6294|10414->6375|10461->6393
                  LINES: 27->1|32->1|32->1|40->9|40->9|40->9|50->19|50->19|51->20|51->20|51->20|51->20|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|57->26|58->27|58->27|59->28|60->29|60->29|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|66->35|68->37|68->37|69->38|69->38|69->38|70->39|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|84->53|84->53|85->54|85->54|85->54|86->55|89->58|89->58|90->59|90->59|90->59|91->60|92->61|92->61|93->62|93->62|93->62|94->63|96->65|96->65|97->66|97->66|97->66|98->67|106->75|106->75|108->77|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|136->105|136->105|136->105|136->105|137->106|145->114|145->114|145->114|150->119|151->120|159->128|159->128|159->128|160->129|164->133|164->133|164->133|164->133|164->133|164->133|165->134|166->135|166->135|166->135|171->140|171->140|172->141|174->143|174->143|174->143|175->144|175->144|175->144|176->145|179->148|181->150
                  -- GENERATED --
              */
          