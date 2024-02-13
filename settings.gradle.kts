dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }
}

rootProject.name = "marketplace-ilyankin-otus-kotlin-20233121"
includeBuild("ok-marketplace-be")
