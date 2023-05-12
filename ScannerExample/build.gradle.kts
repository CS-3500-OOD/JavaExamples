plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("cs3500.examples.Main")
}

group = "cs3500.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}