name := "reactive-core"

description := "An FRP framework"

scalaVersion := "2.10.0"

unmanagedSourceDirectories in Compile <++= (scalaBinaryVersion, baseDirectory) { (sv, bd) => Seq(bd / "src" / "main" / ("scala-"+sv)) }
