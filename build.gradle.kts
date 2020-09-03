plugins {
    kotlin("js") version "1.4.0"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(npm("webpack-node-externals", "2.5.1"))
}

kotlin.js {
    browser {
        webpackTask {
            outputFileName = "main.js"
        }
    }
    nodejs()
}
