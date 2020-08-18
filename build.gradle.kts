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
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.6")
}

kotlin.target {
    useCommonJs()
    nodejs()
}
