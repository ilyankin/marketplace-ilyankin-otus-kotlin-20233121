plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}

group = "ing.ilyankin.pictureworld"
version = "0.0.1"

subprojects {
    group = rootProject.group
    version = rootProject.version
}

tasks {
    arrayOf("build", "clean", "check").forEach { task ->
        create(task) {
            group = "build"
            dependsOn(subprojects.map { project -> project.getTasksByName(task, false) })
        }
    }
}