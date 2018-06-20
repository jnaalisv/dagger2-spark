plugins {
    java
    id ("net.ltgt.apt") version "0.16"
    id ("net.ltgt.apt-idea") version "0.16"
    id ("io.franzbecker.gradle-lombok") version "1.14"
    application
}

lombok {
    version = "1.18.0"
}

application {
    mainClassName = "org.example.SparkApplication"
}

repositories {
    jcenter()
}

val lombokVersion = "1.18.0"
val sparkVersion = "2.7.2"
val daggerVersion = "2.16"

dependencies {

    annotationProcessor ("com.google.dagger:dagger-compiler:$daggerVersion")
    annotationProcessor ("org.projectlombok:lombok:$lombokVersion")

    compile ("com.sparkjava:spark-core:$sparkVersion")
    compile ("com.google.dagger:dagger:$daggerVersion")

    runtime ("ch.qos.logback:logback-classic:1.2.3")
}
