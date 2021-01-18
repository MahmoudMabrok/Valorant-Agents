import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 21
    const val versionCode = 1
    const val versionName = "1.0"
    const val applicationId = "com.ahmedvargos.valorantagents"
    const val compileSdk = 30
    const val targetSdk = 30
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"
    const val buildTools = "30.0.2"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val proguardFiles = "consumer-rules.pro"
}

object Modules {
    const val REMOTE = ":core:remote"
    const val LOCAL = ":core:local"
    const val BASE = ":core:base"
    const val NAVIGATOR = ":core:navigator"
    const val HOME = ":features:home"

//    const val SAFE_ARGS = "androidx.navigation.safeargs"
}

object Versions {
    const val androidx_core = "1.3.2"
    const val app_compat = "1.2.0"
    const val androidx_recyclerview = "1.0.0"
    const val androidx_navigation = "2.0.0"
    const val androidx_constraintLayout = "1.1.3"
    const val material = "1.2.1"
    const val navigation_safeargs = "2.2.0-rc03"
    const val KOIN = "2.0.1"

    const val retrofit = "2.6.2"
    const val retrofitCoroutines = "0.9.2"
    const val retrofitGson = "2.6.2"
    const val gson = "2.8.5"
    const val okHttp = "3.12.1"

    const val junit = "4.12"
    const val androidx_espresso = "3.1.0"
    const val androidx_testing = "1.1.1"
    const val gradleandroid = "4.1.1"
    const val kotlin = "1.4.21"

    const val coroutines_android_version = "1.3.4"
    const val coroutines_test = "1.3.2"
    const val room = "2.2.6"


}

object Dependencies {
    val kotlin_lib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.app_compat}"
    val androidx_constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
    val androidx_material = "com.google.android.material:material:${Versions.material}"
    val androidx_navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
    val androidx_navigation_ui =
        "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation}"
    val androidx_recyclerview =
        "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"
    val jetpack_navigation_safeargs =
        "androidx.navigation.safeargs:${Versions.androidx_recyclerview}"

    val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_android_version}"
    val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_android_version}"

    val koin = "org.koin:koin-android:${Versions.KOIN}"
    val koin_viewModel = "org.koin:koin-androidx-viewmodel:${Versions.KOIN}"
    val koin_scope = "org.koin:koin-androidx-scope:${Versions.KOIN}"

    //retrofit
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_coroutines_adapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    val retrofit_logger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    //room
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    val roomKtx = "androidx.room:room-ktx:${Versions.room}"


    val testlib_junit = "junit:junit:${Versions.junit}"
    val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
    val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
    val testandroidx_espressocore =
        "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"
    val coroutines_testing =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines_test}"


}

object ClassPaths {
    val navigation_safe_args =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation_safeargs}"
    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object RemoteServerConfigs{
    const val DEBUG_BASE_URL = "https://valorant-api.com/v1/"
    const val RELEASE_BASE_URL = "https://valorant-api.com/v1/"
}