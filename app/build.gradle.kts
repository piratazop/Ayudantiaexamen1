plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.ayudantiaexamen1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ayudantiaexamen1"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // ViewModel
    val lifecycle_version = "2.8.0"
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)

    //Retrofit
    implementation (libs.retrofit)
    /*implementation(libs.converter.gson)*/

    implementation (libs.gson)
    implementation (libs.converter.gson.vlatestversion)

    // Room
    val room_version = "2.6.1"
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    /*kapt(libs.androidx.room.compiler)*/

    // Fragment KTX
    implementation(libs.androidx.fragment.ktx)

    implementation (libs.picasso)

    // Retrofit with Scalar Converter
    /*implementation (com.squareup.retrofit2:retrofit:(2.11.0)
    implementation (com.squareup.retrofit2:converter-gson:latest.version)*/

    // Glide
    /*implementation (libs.glide)
    annotationProcessor (libs.compiler)*/

    /*// Lifecycle and LiveData
    val lifecycle_version = "2.8.0"
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)*/

    // Coroutines
    /*implementation(libs.kotlinx.coroutines.android)*/



}