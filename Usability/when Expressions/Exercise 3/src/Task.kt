// WhenExpressions/Task3.kt
package whenExpressionsExercise3

import atomictest.eq
import java.util.Stack

fun balanced(input: String): Boolean {
    val s: Stack<Char> = Stack<Char>()
    for (i in input) {
        when (i) {
            '(' -> {
                s.push('(')
            }

            ')' -> {
                if (s.isNotEmpty()) {
                    s.pop()
                } else {
                    return false
                }
            }

            ' ' -> {}

            else -> throw IllegalArgumentException()
        }
    }
    return s.isEmpty()
}

fun main() {
    balanced("(()) ()") eq true
    balanced(")(") eq false
}