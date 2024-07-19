// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
    var fact = 1L
    for (i in 1..n) {
        fact *= i
    }
    return fact
}

fun main() {
    println(factorial(10))  // 3628800
}