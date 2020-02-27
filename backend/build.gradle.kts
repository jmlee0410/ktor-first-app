val kotlin_version: String by project
val ktor_version: String by project

plugins {
    application
    id("com.github.johnrengelman.shadow").version("5.2.0")
}
application {
    //mainClassName = "io.ktor.server.cio.EngineMain"
    mainClassName = "com.example.ApplicationKt"
}

tasks.withType<Jar> {
    manifest {
        attributes(
            mapOf(
                "Main-Class" to application.mainClassName
            )
        )
        //archiveBaseName.set("${project.name}-all")
    }
}



repositories {
    jcenter()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-cio:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-host-common:$ktor_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
}