name := "java_test"

version := "1.0"

libraryDependencies ++= Seq("junit" % "junit" % "4.4" % "compile->default",
		    "net.sourceforge.cobertura" % "cobertura" % "1.9.4.1" % "test->default",
		    "org.scalatest" % "scalatest_2.9.1" % "1.6.1" % "compile->default")