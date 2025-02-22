addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")

// For the Cross Build
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "1.9.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.1.0")

addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "1.0.1")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.6.5")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.4.6")
