ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Coding Challenges"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.9" % "test"
