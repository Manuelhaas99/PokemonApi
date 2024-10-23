// build.gradle (nivel del proyecto)
buildscript {
    dependencies {
        classpath (libs.gradle) // O la versión del plugin de Android más reciente
        classpath (libs.kotlin.gradle.plugin)
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.hilt) apply false
}