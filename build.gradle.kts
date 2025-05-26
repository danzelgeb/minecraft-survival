plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.5"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "dev.danzel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
    maven { url = uri("https://repo.aikar.co/content/groups/aikar/") }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    implementation("org.projectlombok:lombok:1.18.34")
    implementation("co.aikar:acf-paper:0.5.1-SNAPSHOT")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    annotationProcessor("co.aikar:acf-paper:0.5.1-SNAPSHOT")
}

tasks {

    compileJava {
        options.encoding = "UTF-8"
    }

    build {
        dependsOn("shadowJar")
    }

    runServer {
        minecraftVersion("1.21.4")
    }
}