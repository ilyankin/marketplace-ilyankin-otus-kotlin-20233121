dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
        val foojayResolverConvention: String by settings
        id("org.gradle.toolchains.foojay-resolver-convention") version foojayResolverConvention
    }
}

rootProject.name = "marketplace-ilyankin-otus-kotlin-20233121"
include("m1l1-first")
