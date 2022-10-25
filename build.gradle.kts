plugins {
    id("java")
}

group = "ru.vk.mistressfilth"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.17.2")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("com.google.inject:guice:5.1.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}