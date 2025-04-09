plugins {
    kotlin("jvm") version "1.8.22"
    id("org.jetbrains.intellij") version "1.13.3"
}

group = "com.abdalluh.flutterstructure"
version = "1.0.1"

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

sourceSets {
    main {
        java.srcDirs("src/main/kotlin")
        resources.srcDirs("src/main/resources")
    }
}

intellij {
    version.set("2024.1")
    type.set("IC")
    plugins.set(listOf("terminal"))
    pluginName.set("Flutter Full Structure Generator")
    instrumentCode.set(false) // ✅ مفيش jar غريب
    updateSinceUntilBuild.set(false) // ✅ مفيش override
}

tasks.processResources {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}