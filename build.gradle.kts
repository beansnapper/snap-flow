plugins {
    kotlin("jvm") version "1.4.20"
    kotlin("kapt") version "1.4.20"
}

group = "beansnapper"
version = "0.1-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    compileOnly("beansnapper:snap-builder:0.0.1-SNAPSHOT")
    kapt("beansnapper:snap-builder:0.0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
    implementation("io.github.microutils:kotlin-logging:1.7.8")
    testImplementation("junit", "junit", "4.12")
    testImplementation("io.mockk:mockk:1.10.2")
}
