organization := "org.scala_users.jp"

name := "idiomatic_scala"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.10" % "test"
)
  
resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

EclipseKeys.withSource := true

scalacOptions ++= Seq("-deprecation","-unchecked")

//initialCommands in console += {
//}
