import mill._
import scalalib._
import scalanativelib._
import scalanativelib.api._

object libcurl extends RootModule with ScalaNativeModule {
  def scalaNativeVersion = "0.5.3"
  def scalaVersion = "3.3.3"
  def releaseMode = ReleaseMode.ReleaseFast
  def nativeLTO = LTO.Thin

  // def ivyDeps = Agg()
  // object test extends Tests{
  //   def ivyDeps = Agg(ivy"com.lihaoyi::utest::0.7.7")
  //   def testFrameworks = Seq("utest.runner.Framework")
  // }

}
