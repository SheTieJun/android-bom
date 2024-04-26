# Android Jetpack Bom 32

compileSdk = 32

```toml
kotlin = "1.8.22"
#1.9~1.8 必须是34版本
androidx-activity = "1.7.2"
#1.13.0 必须是34版本
androidx-core= "1.10.0"
#2.7.0 必须是34版本
androidx-lifecycle = "2.6.2"
androidx-cardview = "1.0.0"
androidx-startup = "1.1.1"
androidx-swiperefreshlayout = "1.2.0-alpha01"
#1.10.0 必须是34版本
androidx-webKit = "1.7.0"
#1.3.0-alpha03 必须是34版本
androidx-window = "1.1.0"
#1.8-1.7 必须是34版本
androidx-browser = "1.5.0"
#1.0.0-rc01 必须是34版本
androidx-animationCore = "1.0.0-rc01"
androidx-datastore = "1.0.0"
androidx-draganddrop = "1.0.0"
androidx-concurrent = "1.1.0"
androidx-palette = "1.0.0"
androidx-appcompat = "1.6.1"
androidx-fragment = "1.6.2"
androidx-constraintlayout = "2.1.4"
# 2.7.7 必须是34版本
androidx-navigation = "2.6.0"
# 2.6.1 必须是34版本
androidx-room = "2.5.2"
# 2.9.0 必须是34版本
androidx-work = "2.8.1"
espressoCore = "3.5.1"
# 1.11.0 -1.10 必须34版本 
material = "1.9.0"
preferenceVersion = "1.2.1"
recyclerview = "1.3.2"
androidGradlePlugin = "8.2.2"
biometricKtx = "1.2.0-alpha05"
androidx-splashscreen = "1.0.1"
runner = "1.5.2"
tracingKtx = "1.1.0"
androidx-paging="3.2.1"
```

```kotlin
    implementation(platform("com.github.SheTieJun:androidx-bom:32.1.0.0"))
    implementation("androidx.core:core-ktx")
    implementation("androidx.appcompat:appcompat")
    implementation("com.google.android.material:material")
    implementation("androidx.constraintlayout:constraintlayout")
    implementation("androidx.recyclerview:recyclerview")
    implementation("androidx.work:work-runtime-ktx")
    implementation("androidx.core:core-splashscreen")
    implementation("androidx.activity:activity")
    implementation("androidx.activity:activity-ktx")
    implementation("androidx.palette:palette")
    implementation("androidx.cardview:cardview")
    implementation("androidx.startup:startup-runtime")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout")
    implementation("androidx.webkit:webkit")
    implementation("androidx.window:window")
    implementation("androidx.browser:browser")
    implementation("androidx.concurrent:concurrent-futures-ktx")
    implementation("androidx.test.espresso:espresso-core")
    implementation("androidx.preference:preference-ktx")
    implementation("androidx.test:runner")
    implementation("androidx.fragment:fragment-ktx")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx")
    implementation("androidx.room:room-runtime")
    implementation("androidx.room:room-ktx")
    implementation("androidx.room:room-paging")
    implementation("androidx.work:work-runtime-ktx")
    implementation("androidx.work:work-multiprocess")
    implementation("androidx.navigation:navigation-fragment-ktx")
    implementation("androidx.navigation:navigation-ui-ktx")
    implementation("androidx.paging:paging-runtime-ktx")
    implementation("androidx.tracing:tracing-ktx")
    implementation("androidx.datastore:datastore-preferences")
```


 