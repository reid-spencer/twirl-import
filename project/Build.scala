import play.twirl.sbt.Import.TwirlKeys
import sbt.Keys._
import sbt._
import play.twirl.sbt.SbtTwirl

object Build extends Build {

  lazy val our_settings : Seq[Setting[_]] = Seq(
    name := "twirl-bug",
    version := "1.0",
    scalaVersion := "2.11.4",
    sourceDirectories in (Compile, TwirlKeys.compileTemplates) := (unmanagedSourceDirectories in Compile).value
  )

  lazy val project = Project("twirl-bug", file("."))
    .enablePlugins(SbtTwirl)
    .settings(our_settings:_*)

  override def rootProject = Some(project)
}
