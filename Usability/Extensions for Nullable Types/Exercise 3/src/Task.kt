// NullableExtensions/Task3.kt
package extensionsForNullableTypesExercise3

import atomictest.eq

data class Container(val contents: Any?)

fun Container?.empty(): Boolean = if (this != null) contents == null else true
fun Container?.full(): Boolean = if (this != null) contents != null else false

fun main() {
    val container = Container(42)
    container.empty() eq false
    container.full() eq true

    val emptyContainer = Container(null)
    emptyContainer.empty() eq true
    emptyContainer.full() eq false
}