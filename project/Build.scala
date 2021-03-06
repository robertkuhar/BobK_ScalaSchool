import sbt._
import Keys._

object HelloBuild extends Build {
  val hwsettings = Defaults.defaultSettings ++ Seq(
    organization := "hello",
    name         := "world",
    version      := "1.0-SNAPSHOT",
    scalaVersion := "2.9.0-1"
  )

  val hello = TaskKey[Unit]("hello", "Prints 'Hello World'")

  val helloTask = hello := {
    println("Hello Bob")
  }

  lazy val project = Project (
    "project",
    file ("."),
    settings = hwsettings ++ Seq(helloTask)
  )
}
