import sbt._
import Keys._

object MacroTypeSysBuild extends Build {

  lazy val main = Project("main", file("."), 
    settings = Defaults.defaultSettings ++ Seq(
      organization := "u.abramchuk",
      version := "0.0.1",

      scalaVersion := "2.10.1",
      javaOptions in test += "-Xmx2G -Xms2G -XX:MaxPermSize=1G",
      
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _),
      libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"
    ))
}