// Exceptions/Task3.kt
package exceptionsExercise3
import atomictest.capture
import atomictest.eq

fun repeatChar(ch: Char, n: Int): String {
    require(n >= 0) { "Count 'n' must be non-negative, but was $n." }
    return ch.toString().repeat(n)
}

fun main() {
  repeatChar('a', 4) eq "aaaa"
  capture {
    repeatChar('c', -2)
  } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}