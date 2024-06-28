plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
	implementation("org.lwjgl:lwjgl:3.3.3")
	implementation("org.lwjgl:lwjgl-opengl:3.3.3")
	implementation("org.lwjgl:lwjgl-glfw:3.3.3")
}

