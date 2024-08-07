// IntroGenerics/Task2.kt
package introductionToGenericsExercise2

import atomictest.eq

fun <T> List<T>.reversed(): List<T> {
    val result = mutableListOf<T>()
    for(i in this.size - 1 downTo 0){
        result.add(this[i])
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3)
    list.reversed() eq listOf(3, 2, 1)
}