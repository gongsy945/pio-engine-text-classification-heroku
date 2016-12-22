name := "pio-engine-heroku"

parallelExecution in Test := false

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % "0.9.6",
  "org.apache.spark" %% "spark-core"    % "1.4.1",
  "org.apache.spark" %% "spark-mllib"   % "1.4.1",
  "org.scalatest"    %% "scalatest"     % "2.2.1" % "test"
)

cancelable in Global := true

mainClass in Compile := Some("ServerApp")

enablePlugins(JavaAppPackaging)
