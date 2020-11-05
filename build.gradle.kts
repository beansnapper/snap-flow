plugins {
    java
    kotlin("jvm") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.github.microutils:kotlin-logging:1.7.8")
    testImplementation("junit", "junit", "4.12")
    testImplementation("io.mockk:mockk:1.10.2")
}
