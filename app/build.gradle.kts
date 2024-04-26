
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
}

android {
    namespace = "com.shetj.android.bom"
    compileSdk = 31

    defaultConfig {
        applicationId = "com.shetj.android.bom"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


dependencies {

//    implementation(platform("com.github.SheTieJun:androidx-bom:33.1.0.0"))
//    implementation("androidx.core:core-ktx")
//    implementation("androidx.appcompat:appcompat")
//    implementation("com.google.android.material:material")
//    implementation("androidx.constraintlayout:constraintlayout")
//    implementation("androidx.recyclerview:recyclerview")
//    implementation("androidx.work:work-runtime-ktx")
//    implementation("androidx.metrics:metrics-performance")
//    implementation("androidx.core:core-splashscreen")
//    implementation("androidx.activity:activity:1.6.2")
//    implementation("androidx.activity:activity-ktx:1.6.2")
//    implementation("androidx.palette:palette")
//    implementation("androidx.cardview:cardview")
//    implementation("androidx.startup:startup-runtime")
//    implementation("androidx.swiperefreshlayout:swiperefreshlayout")
//    implementation("androidx.webkit:webkit")
//    implementation("androidx.window:window")
//    implementation("androidx.browser:browser")
//    implementation("androidx.concurrent:concurrent-futures-ktx")
//    implementation("androidx.test.espresso:espresso-core")
//    implementation("androidx.preference:preference-ktx")
//    implementation("androidx.test:runner")
//    implementation("androidx.fragment:fragment-ktx")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx")
//    implementation("androidx.room:room-runtime")
//    implementation("androidx.room:room-ktx")
//    implementation("androidx.room:room-paging")
//    implementation("androidx.work:work-runtime-ktx")
//    implementation("androidx.work:work-multiprocess")
//    implementation("androidx.navigation:navigation-fragment-ktx")
//    implementation("androidx.navigation:navigation-ui-ktx")
//    implementation("androidx.paging:paging-runtime-ktx")
//    implementation("androidx.tracing:tracing-ktx")
//    implementation("androidx.datastore:datastore-preferences")
//    implementation("androidx.metrics:metrics-performance")

    implementation(project(":bom"))
}