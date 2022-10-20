plugins {
    id("java")
}

group = "ru.vk.mistressfilth"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.inject:guice:5.1.0")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("org.slf4j:slf4j-api:2.0.3")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}