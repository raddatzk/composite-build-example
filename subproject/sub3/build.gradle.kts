plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("test-plugin") {
            implementationClass = "SomePlugin"
            id = "test-plugin"
        }
    }
}