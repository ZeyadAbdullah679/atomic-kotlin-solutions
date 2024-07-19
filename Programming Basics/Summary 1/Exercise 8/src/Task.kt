// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int =
    number.toString().reversed().toInt()

fun main() {
    println(reverseDecimal(1234))  // 4321
}