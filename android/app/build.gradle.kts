plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.zajel"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.example.zajel"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    flavorDimensions += "app_env"

    productFlavors {
        // --- 📱 Flavors تطبيق العميل ---
        create("customerDev") {
            dimension = "app_env"
            applicationIdSuffix = ".customer.dev"
            resValue("string", "app_name", "\"Zajel C-Dev\"")
        }
        create("customerStg") { // Pre-production
            dimension = "app_env"
            applicationIdSuffix = ".customer.stg"
            resValue("string", "app_name", "\"Zajel C-Stg\"")
        }
        create("customerProd") { // النسخة النهائية للستور
            dimension = "app_env"
            applicationIdSuffix = ".customer"
            resValue("string", "app_name", "\"Zajel\"")
        }

        // --- 🛵 Flavors تطبيق المندوب ---
        create("deliveryDev") {
            dimension = "app_env"
            applicationIdSuffix = ".delivery.dev"
            resValue("string", "app_name", "\"Zajel D-Dev\"")
        }
        create("deliveryStg") { // Pre-production
            dimension = "app_env"
            applicationIdSuffix = ".delivery.stg"
            resValue("string", "app_name", "\"Zajel D-Stg\"")
        }
        create("deliveryProd") { // النسخة النهائية للستور
            dimension = "app_env"
            applicationIdSuffix = ".delivery"
            resValue("string", "app_name", "\"Zajel Delivery\"")
        }
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    
}

flutter {
    source = "../.."
}
