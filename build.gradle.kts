plugins {
    kotlin("jvm") apply false
}

group = "ing.ilyankin"
version = "0.0.1"

subprojects {
    group = rootProject.group
    version = rootProject.version
}