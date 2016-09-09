name := "kafka-playground"
version := "0.0.0"
scalaVersion := "2.11.8"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.10.0.1"
libraryDependencies += "com.typesafe" % "config" % "1.3.0"
libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.4" % "test"



//lazy val commonSettings = Seq(
//  organization := "com.charlescy",
//  version := "0.0.0"
//)
//
//lazy val root = (project in file("."))
//    .settings(
//      name := "kafka-playground",
//      libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.0"
//    )

