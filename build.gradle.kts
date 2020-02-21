import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val logback_version: String by project
val ktor_version: String by project
val kotlin_version: String by project

plugins {
    java
    kotlin("jvm") version "1.3.61"
}

/*
    allprojects - 최상위 프로젝트를 포함한 모든 하위 프로젝트에 공통 적용
 */
allprojects {
    group = "com.example"
    version = "0.0.1-SNAPSHOT"
    apply(plugin = "org.jetbrains.kotlin.jvm")
    repositories {
        mavenCentral()
    }
    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
        implementation("ch.qos.logback:logback-classic:$logback_version")
    }
}

/*
    subprojects 내의 설정값들은 모든 하위 프로젝트에 적용
 */
subprojects {
    version = "0.0.2-SNAPSHOT"
}

/*
    project - 특정 프로젝트에 적용 (여기에서는 backend 프로젝트에만 적용 됨)
 */
project("backend") {
    version = "0.0.3-SNAPSHOT"
}
