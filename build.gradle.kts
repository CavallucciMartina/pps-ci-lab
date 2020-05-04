plugins {
  id("java")
    id("application")
}

repositories {
  mavenCentral()
}

val junitVersion: String = "5.3.2"

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

application {
  mainClassName = "Foo"
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

