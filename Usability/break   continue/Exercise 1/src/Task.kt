// BreakAndContinue/Task1.kt
package breakAndContinueExercise1

import atomictest.*

fun readNumbers(vararg n: String) {
    var sum = 0
    for (i in n) {
        when (i) {
            in "1".."9" -> sum += i.toInt()
            "0" -> break
            else -> trace("Not a number: $i")
        }
    }
    trace("Sum: $sum")
}

fun main() {
    readNumbers("1", "a", "3", "10", "0", "19")
    trace eq """
    Not a number: a
    Sum: 14
  """
}