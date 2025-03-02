
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

    implementation (libs.kotlin.stdlib)
    implementation (libs.androidx.core.ktx)
    implementation (libs.androidx.appcompat)
    implementation (libs.androidx.constraintlayout)
    implementation (libs.androidx.cardview)
    implementation (libs.androidx.legacy.support.v4)
    implementation (libs.androidx.fragment.ktx)


    //Tests
    testImplementation (libs.junit)
    testImplementation (libs.hamcrest.library)
    androidTestImplementation (libs.androidx.junit)
    androidTestImplementation (libs.androidx.espresso.core)
    androidTestImplementation (libs.androidx.espresso.contrib)

    //MaterialDesign
    implementation (libs.material.v1130alpha05)

    //Coordinator layout
    implementation (libs.androidx.coordinatorlayout)

    //Glide
    implementation (libs.glide)
    annotationProcessor (libs.glide.compiler)

    //Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.logging.interceptor)

    //Dagger
    implementation (libs.dagger)
    kapt (libs.google.dagger.compiler)

    //Room

    implementation (libs.androidx.room.room.runtime2)
    implementation (libs.androidx.room.rxjava3)
    kapt (libs.androidx.room.room.compiler3)

    //Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    //RxJava
    implementation (libs.rxandroid)
    implementation (libs.rxjava)
    implementation (libs.rxkotlin)
    implementation (libs.rxjava3.retrofit.adapter)
}