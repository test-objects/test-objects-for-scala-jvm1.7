
name := "test-objects-for-scala-jvm1.7"

organization := "org.testobjects"

homepage := Some(new URL("https://github.com/test-objects/test-objects-for-scala-jvm1.7"))

scmInfo := Some(
  ScmInfo(
    new URL("https://github.com/test-objects/test-objects-for-scala-jvm1.7"),
    "scm:git:git@github.com:test-objects/test-objects-for-scala-jvm1.7.git"
  )
)

developers := List(
  new Developer(
    "chrisdostert",
    "Chris Dostert",
    "chris.dostert@live.com",
    new URL("https://github.com/chrisdostert")
  )
)

version := "0.2.0"

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.7"
crossScalaVersions := Seq(
  "2.10.4",
  "2.11.7"
)

pomIncludeRepository := { _ => false }

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"

publishTo := Some("Bintray API Realm" at "https://api.bintray.com/maven/test-objects/maven/test-objects-for-scala-jvm1.7/;publish=1")

publishMavenStyle := true

credentials += Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  sys.env.getOrElse(
    "BINTRAY_USERNAME",
    ""
  ),
  sys.env.getOrElse(
    "BINTRAY_API_KEY",
    ""
  )
)
