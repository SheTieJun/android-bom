# Androidx Jetpack Bom

## 说明

因为在公司维护比较多的项目，最近总是出现最低版本编译（`minCompileSdk`）错误，所以决定创建相关`BOM`帮助自己的对一些**老项目进行升级**
```kotlin
Dependency 'androidx.xxxxx' requires libraries and applications that
        depend on it to compile against version 34 or later of the Android APIs.
```

> 本项目是基于Androidx Jetpack 进行的封装，方便自己的项目进行升级,不用每次都去查找对应的版本
> 但是不是含有所有的Jetpack项目，只是一些常用的项目，如果有需要其他还是需要你自己去查找对应的版本，也可以对当前项目进行升级

项目也是一个创建BOM的示例，如果这个技术或者项目对你们也有用的话，可以star项目一下。

- [利用Gradle创建BOM,解决minCompileSdk 的编译问题](https://github.com/SheTieJun/androidx-bom/wiki/%E5%88%A9%E7%94%A8Gradle%E5%88%9B%E5%BB%BABOM,%E8%A7%A3%E5%86%B3minCompileSdk-%E7%9A%84%E7%BC%96%E8%AF%91%E9%97%AE%E9%A2%98)

#  相关文档
## :white_check_mark: [Android Jetpack Bom 34](doc/Android-Jetpack-Bom-34.MD)

- **分支：[Bom-34](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-34)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:34.1.0.1"))
}
```
## :white_check_mark: [Android Jetpack Bom 33](doc/Android-Jetpack-Bom-33.MD)

- **分支：[Bom-33](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-33)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:33.1.0.0"))
}
```
## :white_check_mark: [Android Jetpack Bom 32](doc/Android-Jetpack-Bom-32.MD)

- **分支：[Bom-32](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-32)**
```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:32.1.0.0"))
}
```

## :white_check_mark: [Android Jetpack Bom 31](doc/Android-Jetpack-Bom-31.MD) 

- **分支：[Bom-31](https://github.com/SheTieJun/androidx-bom/tree/feature/bom-31)**

```kotlin
dependencies {
    implementation(platform("com.github.SheTieJun:androidx-bom:31.1.0.0"))
}
```

> 都已测试通过,对应的minCompileSdk >= 对应的BOM版本,更低的我好像用不到了

## 使用案例
- **Step 1. Add the JitPack repository to your build file**
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
- **Step 2. Add the dependency**
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