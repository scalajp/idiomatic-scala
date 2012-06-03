organization := "org.scala_users.jp"

name := "idiomatic_scala"

version := "0.1"

scalaVersion := "2.9.1"

//write if dependencies are needed
libraryDependencies ++= Seq()

EclipseKeys.withSource := true

scalacOptions ++= Seq("-deprecation","-unchecked")

//initialCommands in console += {
//}
