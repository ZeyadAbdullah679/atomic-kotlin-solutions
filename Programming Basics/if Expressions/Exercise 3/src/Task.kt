// IfExpressions/Task3.kt
package ifExpressionsExercise3

import kotlin.math.max

fun findMax(first: Int, second: Int): Int =
  max(first, second)

fun main() {
  println(findMax(-1, 4))  // 4
}