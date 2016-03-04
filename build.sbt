name := """testconn"""

version := "1.0-SNAPSHOT"

//lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

//Play2WarPlugin.play2WarSettings
//Play2WarKeys.servletVersion //:= "3.0"


libraryDependencies ++= Seq(
  javaJdbc,
  jdbc,
  cache,
  javaWs,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.0.2.Final",
  //"mysql" % "mysql-connector-java" % "5.1.34"
  "org.postgresql" % "postgresql" % "9.2-1003-jdbc4",
  "commons-io" % "commons-io" % "2.4"
  //"org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


//fork in run := true


fork in run := true