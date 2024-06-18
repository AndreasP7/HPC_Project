

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
}


buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        //maven { url "https://jitpack.io" } // Προσθήκη του JitPack repository
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2") // Αναβάθμιση στην τελευταία έκδοση
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
       // maven { url "https://jitpack.io" } // Προσθήκη του JitPack repository
    }
}