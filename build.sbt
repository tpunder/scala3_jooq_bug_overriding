scalaVersion := "3.3.1"
crossScalaVersions := Seq("3.3.1", "2.13.10", "2.12.18")
compileOrder := CompileOrder.JavaThenScala
scalacOptions := (if (scalaVersion.value.startsWith("3.")) Seq("-explain") else Nil)