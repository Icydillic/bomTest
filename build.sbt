name := "CsvBomTest"

version := "0.1"

scalaVersion := "2.12.4"

val vKantan = "0.3.1"

libraryDependencies ++= Seq(
  "com.nrinaudo" %% "kantan.csv"         % vKantan,
  "com.nrinaudo" %% "kantan.csv-generic" % vKantan,
  "com.nrinaudo" %% "kantan.csv-java8"   % vKantan
)