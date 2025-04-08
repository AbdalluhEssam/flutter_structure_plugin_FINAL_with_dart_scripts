plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jetbrains.intellij") version "1.10.0"
}

group = "com.abdalluh.flutterstructure"
version = "1.0.0"

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

intellij {
    version.set("2023.1")
    type.set("IU") // IU = IntelliJ Ultimate ← بيدعم Execution & Terminal
    downloadSources.set(true)
    plugins.set(listOf("org.jetbrains.plugins.terminal"))
}

tasks {
    patchPluginXml {
        changeNotes.set("Initial release of Flutter Structure Generator Plugin.")
    }
}