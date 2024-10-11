plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
<<<<<<< HEAD
    namespace = "com.poli.pruebapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.poli.pruebapp"
=======
    namespace = "com.Poli.lingolink"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.Poli.lingolink"
>>>>>>> 54470956a43e9d747034cd275b9f10a8601f4e9a
        minSdk = 24
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
<<<<<<< HEAD
    buildFeatures {
        viewBinding = true
    }
=======
>>>>>>> 54470956a43e9d747034cd275b9f10a8601f4e9a
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
<<<<<<< HEAD
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
=======
>>>>>>> 54470956a43e9d747034cd275b9f10a8601f4e9a
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}