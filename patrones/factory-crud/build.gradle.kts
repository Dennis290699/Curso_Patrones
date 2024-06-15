plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
	implementation(project(":factory"))
	implementation("org.xerial:sqlite-jdbc:3.46.0.0")
	implementation("com.zaxxer:HikariCP:5.1.0")
}

