// Sets/Task2.kt
package setsExercise2

import kotlin.random.Random

fun experiment(): Int {
    val set = mutableSetOf<Int>()
    var count = 0
    do {
        count++
        set += Random.nextInt(1, 26)
    } while (set.size < 25)
    return count
}

fun main() {
    val counts = mutableListOf<Int>()
    repeat(1000) {
        counts += experiment()
    }
    println(counts.average())
}