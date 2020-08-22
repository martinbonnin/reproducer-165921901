include(":jvmLib")
include(":mppLib")
// Comment this module to make autocomplete work again
include(":androidLib")

pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }

  resolutionStrategy {
    eachPlugin {
      if (requested.id.id == "com.android.library") {
        useModule("com.android.tools.build:gradle:4.0.1")
      }
    }
  }
}