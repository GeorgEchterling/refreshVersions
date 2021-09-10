@file:Suppress("PackageDirectoryMismatch", "SpellCheckingInspection", "unused")

import de.fayard.refreshVersions.core.DependencyGroup
import org.gradle.api.Incubating

/**
 * An HTTP inspector for Android & OkHTTP (like Charles but on device)
 *
 * - GitHub page: [Chucker](https://github.com/ChuckerTeam/chucker)
 * - [GitHub Releases here](https://github.com/ChuckerTeam/chucker/releases)
 */
@Incubating
object Chucker : DependencyGroup(
    group = "com.github.chuckerteam.chucker",
    rawRule = """
        com.github.chuckerteam.chucker:library(-*)
                               ^^^^^^^
    """.trimIndent()
) {
    val library = module("library")
    val libraryNoOp = module("library-no-op")
}
