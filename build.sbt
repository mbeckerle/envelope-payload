name := "dfdl-envelope-payload"

organization := "io.github.dfdlschemas"

version := "1.1.0"

daffodilVersion := "3.9.0"

libraryDependencies ++= Seq(
  "io.github.dfdlschemas" % "dfdl-tcpmessage" % "1.1.0",
  "com.owlcyberdefense" % "dfdl-mil-std-2045" % "1.3.2",
  "com.tresys" % "dfdl-pcap" % "1.4.0"
)

enablePlugins(DaffodilPlugin)
daffodilPackageBinVersions := Seq(daffodilVersion.value)
daffodilPackageBinInfos := Seq(
  ("/io/github/dfdlschemas/envelopepayload/xsd/envelopePayload.dfdl.xsd", Some("message"), None)
)
daffodilTdmlUsesPackageBin := true
