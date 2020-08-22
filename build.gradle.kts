plugins {
  id("com.android.library").apply(false)
  id("org.jetbrains.kotlin.jvm").version("1.4.0").apply(false)
  id("org.jetbrains.kotlin.multiplatform").version("1.4.0").apply(false)
}

subprojects {
  repositories {
    mavenCentral()
  }
}