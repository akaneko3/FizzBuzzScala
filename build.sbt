name := "FizzBuzz"

version := "1.0"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.3.4" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
