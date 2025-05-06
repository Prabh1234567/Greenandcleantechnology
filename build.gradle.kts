plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // AGP version 8.6.0
        classpath("com.android.tools.build:gradle:8.6.0")
    }
}
