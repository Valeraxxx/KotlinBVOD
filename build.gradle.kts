val explode by configurations.creating

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

dependencies {
    explode("com.beust:klaxon:5.5")
    explode("com.github.nkzawa:socket.io-client:0.6.0")
}

