plugins {
    java
    application
    id("org.openjfx.javafxplugin") version("0.0.9")
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation( "org.slf4j:slf4j-api:1.7.30")
    implementation("org.openjfx:javafx-web:11.0.2")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.assertj:assertj-core:3.16.1")
    testImplementation("org.skyscreamer:jsonassert:1.5.0")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

javafx {
    version = "11.0.2"
    modules = listOf(
        "javafx.base",
        "javafx.controls",
        "javafx.fxml",
        "javafx.graphics",
        "javafx.media",
        "javafx.swing",
        "javafx.web"
    )
}