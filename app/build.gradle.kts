plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.snkcorp.jbfinder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.snkcorp.jbfinder"
        minSdk = 19
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    packagingOptions {
        exclude("META-INF/ASL2.0")
        exclude("META-INF/LICENSE")
        exclude("META-INF/NOTICE")
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/notice.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/dependencies.txt")
        exclude("META-INF/ASL2.0.txt")
        exclude("META-INF/LGPL2.1")
        exclude("META-INF/services/javax.annotation.processing.Processor")
        exclude("androidsupportmultidexversion.txt")
    }
}

dependencies {

    implementation("org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.1.0")
    implementation("com.android.support:support-v4:28.0.0")
    implementation("com.android.support:localbroadcastmanager:28.0.0")

    implementation("org.eclipse.paho:org.eclipse.paho.android.service:1.1.1") {
        exclude(group = "com.android.support")
        exclude(module = "appcompat-v7")
        exclude(module = "support-v4")
    }

    implementation ("com.android.support:multidex:1.0.3")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation("com.google.firebase:firebase-analytics")
    implementation(platform("com.google.firebase:firebase-bom:32.6.0"))
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment:2.7.4")
    implementation("androidx.navigation:navigation-ui:2.7.4")
    implementation ("org.osmdroid:osmdroid-android:6.1.8")
    implementation ("org.osmdroid:osmdroid-wms:6.1.11")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}