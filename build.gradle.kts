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
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib"))
    implementation("com.google.guava:guava:28.0-jre")
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    test {
        useJUnitPlatform()
    }
}
