
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id ("kotlin-parcelize")
    id ("kotlin-kapt")

}
kapt {
    generateStubs = true
}
android {
    namespace = "com.ivantsovdev.moviesearch"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ivantsovdev.moviesearch"
        minSdk = 21
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
        buildConfig = true
    }
}

dependencies {
    implementation (libs.glide)
    implementation(libs.transport.runtime)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.androidx.room.common)
    annotationProcessor (libs.glide.compiler)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.material.v1130alpha05)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.logging.interceptor)
    implementation (libs.dagger)
    kapt (libs.google.dagger.compiler)
    implementation (libs.androidx.room.runtime)
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.room.ktx)
    implementation (libs.room.runtime)
    implementation (libs.androidx.room.rxjava3)
    kapt (libs.room.compiler)
    implementation (libs.rxandroid)
    implementation (libs.rxjava)
}