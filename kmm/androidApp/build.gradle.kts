plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.bloder.kmm_poc.android"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0")
    implementation("io.arrow-kt:arrow-core:1.1.2")
    implementation("io.arrow-kt:arrow-optics:1.1.2")
    implementation("io.arrow-kt:arrow-fx-coroutines:1.1.2")
    implementation("androidx.activity:activity-ktx:1.5.0")
    implementation("io.insert-koin:koin-android:3.1.6")
}