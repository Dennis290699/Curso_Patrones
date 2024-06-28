plugins {
    id("java")
    id("io.freefair.lombok") version "8.6"
}

repositories {
    mavenCentral()
}

dependencies {
	implementation(project(":factory"))
	implementation("org.xerial:sqlite-jdbc:3.46.0.0")
	implementation("com.zaxxer:HikariCP:5.1.0")
}

