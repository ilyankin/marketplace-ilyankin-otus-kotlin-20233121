plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}

group = "ing.ilyankin.marketplace"
version = "0.0.1"

subprojects {
    group = rootProject.group
    version = rootProject.version
}