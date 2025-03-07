/*
 * Copyright 2025-2025 Abhimanyu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("UnstableApiUsage")

import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.detekt)
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlinx.binary.compatibility.validator)
    alias(libs.plugins.screenshot)
    alias(libs.plugins.maven.publish)
}

kotlin {
    explicitApi()
}

android {
    namespace = "com.makeappssimple.abhimanyu.cosmosdesignsystem"
    compileSdk = libs.versions.compile.sdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.min.sdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    lint {
        checkAllWarnings = true
        warningsAsErrors = true
        baseline = file("lint-baseline.xml")
        disable += "AndroidGradlePluginVersion"
    }

    experimentalProperties["android.experimental.enableScreenshotTest"] = true
}

composeCompiler {
    reportsDestination = layout.buildDirectory.dir("compose_compiler")
    metricsDestination = layout.buildDirectory.dir("compose_compiler")
}

dependencies {
    androidTestImplementation(libs.androidx.compose.ui.test.manifest)

    debugImplementation(libs.androidx.compose.ui.test.junit4)

    detektPlugins(libs.bundles.detekt)

    implementation(platform(libs.androidx.compose.bom))

    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.runtime)
    screenshotTestImplementation(libs.androidx.compose.ui.tooling)
}

tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(project.the<SourceSetContainer>()["main"].allSource)
}

artifacts {
    archives(tasks.named("sourcesJar"))
}

mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        groupId = "io.github.abhimanyu14",
        artifactId = "cosmos-design-system",
        version = "1.0.0"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("Cosmos Design System")
        description.set("Cosmos Design System")
        inceptionYear.set("2025")
        url.set("https://github.com/Abhimanyu14/cosmos-design-system")

        licenses {
            license {
                name.set("Apache License 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0")
            }
        }

        // Specify developers information
        developers {
            developer {
                id.set("Abhimanyu14")
                name.set("Abhimanyu")
                email.set("abhimanyu.n14@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/Abhimanyu14/cosmos-design-system")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}
