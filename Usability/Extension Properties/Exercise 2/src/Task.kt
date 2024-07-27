// ExtensionProperties/Task2.kt
package extensionPropertiesExercise2

import atomictest.eq

val <T> List<T>.reversed: List<T>
    get() {
        val reversed = mutableListOf<T>()
        for (i in lastIndex downTo 0)
            reversed.add(this[i])
        return reversed
    }

fun main() {
    /*
      val list = listOf(1, 2, 3)
      list.reversed eq listOf(3, 2, 1)
    */
}