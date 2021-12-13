plugins {
    `java-library`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.github.nkzawa:socket.io-client:0.6.0")
    implementation("com.beust:klaxon:5.5")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
}

configurations {                            
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}
