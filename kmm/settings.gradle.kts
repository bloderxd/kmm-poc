pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kmm-poc"
include(":androidApp")
include(":shared")
enableFeaturePreview("VERSION_CATALOGS")