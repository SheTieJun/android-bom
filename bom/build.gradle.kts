plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("maven-publish")
    id("kotlin-kapt")
}

android {
    namespace = "com.androidx.bom"
    compileSdk = 33

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
    add(MavenDep("androidx.core", "core-ktx", "1.6.0"))
    add(MavenDep("androidx.appcompat", "appcompat", "1.3.1"))
    add(MavenDep("androidx.constraintlayout", "constraintlayout", "2.1.0"))
    add(MavenDep("androidx.recyclerview", "recyclerview", "1.2.1"))
    add(MavenDep("androidx.work", "work-runtime-ktx", "2.7.0"))
    add(MavenDep("androidx.core", "core-splashscreen", "1.0.1"))
    add(MavenDep("androidx.activity", "activity-ktx", "1.3.1"))
    add(MavenDep("androidx.palette", "palette", "1.0.0"))
    add(MavenDep("androidx.cardview", "cardview", "1.0.0"))
    add(MavenDep("com.google.android.material", "material", "1.4.0"))
    add(MavenDep("androidx.startup", "startup-runtime", "1.1.0"))
    add(MavenDep("androidx.swiperefreshlayout", "swiperefreshlayout", "1.1.0"))
    add(MavenDep("androidx.webkit", "webkit", "1.4.0"))
    add(MavenDep("androidx.window", "window", "1.0.0-alpha06"))
    add(MavenDep("androidx.browser", "browser", "1.3.0"))
    add(MavenDep("androidx.core", "core-animation", "1.0.0-rc01"))
    add(MavenDep("androidx.concurrent", "concurrent-futures-ktx", "1.1.0"))
    add(MavenDep("androidx.test.espresso", "espresso-core", "3.4.0"))
    add(MavenDep("androidx.preference", "preference-ktx", "1.1.1"))
    add(MavenDep("androidx.test", "runner", "1.4.0"))
    add(MavenDep("androidx.fragment", "fragment-ktx", "1.4.1"))
    add(MavenDep("androidx.lifecycle", "lifecycle-runtime-ktx", "2.7.0"))
    add(MavenDep("androidx.lifecycle", "lifecycle-viewmodel-ktx", "2.7.0"))
    add(MavenDep("androidx.lifecycle", "lifecycle-livedata-ktx", "2.7.0"))
    val roomVersion = "2.4.0"
    add(MavenDep("androidx.room", "room-runtime", roomVersion))
    add(MavenDep("androidx.room", "room-ktx", roomVersion))
    add(MavenDep("androidx.room", "room-compiler", roomVersion))
    add(MavenDep("androidx.room", "room-paging", roomVersion))
    val workVersion = "2.5.0"
    add(MavenDep("androidx.work", "work-runtime-ktx", workVersion))
    add(MavenDep("androidx.work", "work-multiprocess", workVersion))
    val navigationVersion = "2.4.0"
    add(MavenDep("androidx.navigation", "navigation-fragment-ktx", navigationVersion))
    add(MavenDep("androidx.navigation", "navigation-ui-ktx", navigationVersion))
    add(MavenDep("androidx.paging", "paging-runtime-ktx", "3.0.1"))
    add(MavenDep("androidx.tracing", "tracing-ktx", "1.2.0"))
    add(MavenDep("androidx.datastore", "datastore-preferences", "1.0.0"))
    add(MavenDep("androidx.metrics", "metrics-performance", "1.0.0-beta01"))
}

dependencies {
    depList.forEach {
        api("${it.group}:${it.name}:${it.version}")
    }
}

publishing {
    // Define your local maven path
    repositories {
        maven {
            mavenLocal()
        }
    }
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.SheTieJun"
            artifactId = "androidx-bom"
            version = "30.1.0.0"
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