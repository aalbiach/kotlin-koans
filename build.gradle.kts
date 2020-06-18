buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.3.72"))
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
    kotlin("jvm") version "1.3.72"
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
    compile("com.google.guava:guava:28.0-jre")
    testCompile("org.junit.jupiter:junit-jupiter:5.4.0")
}
