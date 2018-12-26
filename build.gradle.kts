buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.3.11"))
    }
}

//This is necessary to make the version accessible in other places
val kotlinVersion: String? by extra {
    buildscript.configurations["classpath"]
            .resolvedConfiguration
            .firstLevelModuleDependencies
            .find { it.moduleName == "kotlin-gradle-plugin" }?.moduleVersion
}

plugins {
    // application
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM
    kotlin("jvm") version "1.3.11"
}

sourceSets {
    main { java.srcDir("src") }
    test { java.srcDir("test") }
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
    compile("com.google.guava:guava:16.0")
    testCompile("junit:junit:4.12")
}
