// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String =
    if (number == 0)
        "zero"
    else if (number < 0)
        "negative"
    else
        "positive"

fun main() {
    println(checkSign(-19))  // negative
}