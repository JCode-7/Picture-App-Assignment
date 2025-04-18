plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pictureappassignment"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.pictureappassignment"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}

dependencies {
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.fragment:fragment:1.5.5")
    implementation ("androidx.cardview:cardview:1.0.0")
}

