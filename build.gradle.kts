plugins {
    id("com.android.application") version "8.8.2" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
    //id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
}

// Configuration pour résoudre les conflits de dépendances
//allprojects {
//  configurations.all {
//     resolutionStrategy {
            // Forcer l'utilisation de la version la plus récente des annotations
//        force("org.jetbrains:annotations:23.0.0")
            // Exclure l'ancienne version
//       exclude(group = "com.intellij", module = "annotations")
//    }
// }
//}