// Booleans/Task2.kt
package booleansExercise2

import upcasting.show

fun showAnd(first: Boolean, second: Boolean) {
    println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
    println("$first || $second == ${first || second}")
}

fun showTruthTable() {
    showAnd(false, false)
    showAnd(true, false)
    showAnd(false, true)
    showAnd(true, true)

    showOr(false, false)
    showOr(true, false)
    showOr(false, true)
    showOr(true, true)
}

fun main() {
    showTruthTable()
}