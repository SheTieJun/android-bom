plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("maven-publish")
    id("kotlin-kapt")
}

android {
    namespace = "com.androidx.bom"
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
class MavenDep(val group: String, val name: String, val version: String)

val depList = mutableListOf<MavenDep>().apply {
    add(MavenDep("androidx.core", "core-ktx", libs.versions.androidx.core.get()))
    add(MavenDep("androidx.appcompat", "appcompat", libs.versions.androidx.appcompat.get()))
    add(MavenDep("androidx.constraintlayout", "constraintlayout", libs.versions.androidx.constraintlayout.get()))
    add(MavenDep("androidx.recyclerview", "recyclerview", libs.versions.recyclerview.get()))
    add(MavenDep("androidx.core", "core-splashscreen", libs.versions.androidx.splashscreen.get()))
    add(MavenDep("androidx.activity", "activity", libs.versions.androidx.activity.get()))
    add(MavenDep("androidx.activity", "activity-ktx", libs.versions.androidx.activity.get()))
    add(MavenDep("androidx.palette", "palette", libs.versions.androidx.palette.get()))
    add(MavenDep("androidx.cardview", "cardview", libs.versions.androidx.cardview.get()))
    add(MavenDep("com.google.android.material", "material", libs.versions.material.get()))
    add(MavenDep("androidx.startup", "startup-runtime", libs.versions.androidx.startup.get()))
    add(MavenDep("androidx.swiperefreshlayout", "swiperefreshlayout", libs.versions.androidx.swiperefreshlayout.get()))
    add(MavenDep("androidx.webkit", "webkit", libs.versions.androidx.webKit.get()))
    add(MavenDep("androidx.window", "window", libs.versions.androidx.window.get()))
    add(MavenDep("androidx.browser", "browser", libs.versions.androidx.browser.get()))
    add(MavenDep("androidx.concurrent", "concurrent-futures-ktx", libs.versions.androidx.concurrent.get()))
    add(MavenDep("androidx.test.espresso", "espresso-core",libs.versions.espressoCore.get()))
    add(MavenDep("androidx.preference", "preference-ktx", libs.versions.preferenceVersion.get()))
    add(MavenDep("androidx.test", "runner", libs.versions.runner.get()))
    add(MavenDep("androidx.fragment", "fragment-ktx", libs.versions.androidx.fragment.get()))
    val lifecycleVersion  =libs.versions.androidx.lifecycle.get()
    add(MavenDep("androidx.lifecycle", "lifecycle-runtime-ktx", lifecycleVersion))
    add(MavenDep("androidx.lifecycle", "lifecycle-viewmodel-ktx", lifecycleVersion))
    add(MavenDep("androidx.lifecycle", "lifecycle-livedata-ktx", lifecycleVersion))
    val roomVersion = libs.versions.androidx.room.get()
    add(MavenDep("androidx.room", "room-runtime", roomVersion))
    add(MavenDep("androidx.room", "room-ktx", roomVersion))
    add(MavenDep("androidx.room", "room-compiler", roomVersion))
    add(MavenDep("androidx.room", "room-paging", roomVersion))
    val workVersion = libs.versions.androidx.work.get()
    add(MavenDep("androidx.work", "work-runtime-ktx", workVersion))
    add(MavenDep("androidx.work", "work-multiprocess", workVersion))
    val navigationVersion = libs.versions.androidx.navigation.get()
    add(MavenDep("androidx.navigation", "navigation-fragment-ktx", navigationVersion))
    add(MavenDep("androidx.navigation", "navigation-ui-ktx", navigationVersion))
    add(MavenDep("androidx.paging", "paging-runtime-ktx", libs.versions.androidx.paging.get()))
    add(MavenDep("androidx.tracing", "tracing-ktx", libs.versions.tracingKtx.get()))
    add(MavenDep("androidx.datastore", "datastore-preferences", libs.versions.androidx.datastore.get()))
}

dependencies {
//    depList.forEach {
//        api("${it.group}:${it.name}:${it.version}")
//    }
}

publishing {
    // Define your local maven path
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.SheTieJun"
            artifactId = "androidx-bom"
            version = "31.1.0.0"
            pom.withXml {
                asNode().appendNode("dependencyManagement")
                    .appendNode("dependencies")
                    .also { dependencies ->
                        depList.forEach { mavenDep ->
                            val depNode = dependencies.appendNode("dependency")
                            depNode.appendNode("groupId", mavenDep.group)
                            depNode.appendNode("artifactId", mavenDep.name)
                            depNode.appendNode("version", mavenDep.version)
                        }
                    }
            }
        }
    }
}