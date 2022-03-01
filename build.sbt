name := "sample-library"

version := "0.1"

scalaVersion := "2.12.12"

idePackagePrefix := Some("cegladanych")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.1.2",
  "org.apache.spark" %% "spark-sql" % "3.1.2",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)


