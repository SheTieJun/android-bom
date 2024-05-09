# Androidx Jetpack Bom

## illustrate

Because the company maintains many projects, the lowest version compilation always appears recently (`minCompileSdk`) error, so I decided to create a related`BOM`Help yourself to some**Upgrade old projects**

```kotlin
Dependency 'androidx.xxxxx' requires libraries and applications that
        depend on it to compile against version 34 or later of the Android APIs.
```

> This project is encapsulated based on Androidx Jetpack to facilitate upgrading your own project without having to find the corresponding version every time.
> But it does not include all Jetpack projects, just some commonly used projects. If you need other projects, you still need to find the corresponding version yourself, and you can also upgrade the current project.

The project is also an example of creating a BOM. If this technology or project is also useful to you, you can star the project.

-   [Use Gradle to create BOM and solve the compilation problem of minCompileSdk](https://github.com/SheTieJun/androidx-bom/wiki/%E5%88%A9%E7%94%A8Gradle%E5%88%9B%E5%BB%BABOM,%E8%A7%A3%E5%86%B3minCompileSdk-%E7%9A%84%E7%BC%96%E8%AF%91%E9%97%AE%E9%A2%98)

# Related documents

## :white_check_mark:[Android Jetpack Bom 34](doc/Android-Jetpack-Bom-34.MD)

-   **Branch:[Bom-34](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-34)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:34.1.0.1"))
}
```

## :white_check_mark:[Android Jetpack Bom 33](doc/Android-Jetpack-Bom-33.MD)

-   **Branch:[Bom-33](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-33)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:33.1.0.0"))
}
```

## :white_check_mark:[Android Jetpack Bom 32](doc/Android-Jetpack-Bom-32.MD)

-   **Branch:[Bom-32](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-32)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:32.1.0.0"))
}
```

## :white_check_mark:[Android Jetpack Bom 31](doc/Android-Jetpack-Bom-31.MD)

-   **Branch:[Bom-31](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-31)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:31.1.0.0"))
}
```

> All have been tested and passed. The corresponding minCompileSdk >= the corresponding BOM version. I don’t seem to be able to use lower versions.

## Use Cases

-   **Step 1. Add the JitPack repository to your build file**

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral() //如果发布在本地
        maven("https://jitpack.io") //如果发布jitpack
    }
}
```

-   **Step 2. Add the dependency**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:${compileSdkVersion}.1.0.0"))
    implementation("androidx.core:core-ktx")
    implementation("androidx.appcompat:appcompat")
    implementation("com.google.android.material:material")
    implementation("androidx.constraintlayout:constraintlayout")
    implementation("androidx.recyclerview:recyclerview")
    implementation("androidx.metrics:metrics-performance")
    implementation("androidx.core:core-splashscreen")
    implementation("androidx.activity:activity:1.6.2")
    implementation("androidx.activity:activity-ktx:1.6.2")
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
    implementation("androidx.metrics:metrics-performance")
    implementation("androidx.media3:media3-session")
    implementation("androidx.media3:media3-ui")
    implementation("androidx.media3:media3-exoplayer")
    implementation("androidx.media3:media3-exoplayer-dash")
    implementation("androidx.media3:media3-exoplayer-hls")
    implementation("androidx.media3:media3-exoplayer-rtsp")
    implementation("androidx.media3:media3-datasource-rtmp")
    implementation("androidx.media3:media3-datasource-cronet")
    implementation("androidx.media3:media3-datasource-okhttp")
    kapt("androidx.room:room-compiler")
}
```
