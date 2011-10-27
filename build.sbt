name := "Lift SBT Template"

version := "0.1"

scalaVersion := "2.9.0-1"

seq(WebPlugin.webSettings: _*)

libraryDependencies ++= {
  val liftVersion = "2.4-M3"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
    "org.mortbay.jetty" % "jetty" % "6.1.26" % "jetty",
    "junit" % "junit" % "4.7" % "test",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.8" % "test"
  )
}

resolvers += Resolver.url("Java.net Repo", url("http://download.java.net/maven/2/"))