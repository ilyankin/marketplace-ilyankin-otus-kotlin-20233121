plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

group = "ing.ilyankin.marketplace"
version = "1.0.0"

subprojects {
    group = rootProject.group
    version = rootProject.version
}
