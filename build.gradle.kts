plugins {
    kotlin("jvm") version "1.3.72"
    application
}

group = "us.sodiumlabs"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("us.sodiumlabs.tacotakeaway.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    // http://sparkjava.com/documentation#getting-started
    implementation("com.sparkjava:spark-kotlin:1.0.0-alpha")
    implementation("org.slf4j:slf4j-simple:1.7.21")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}