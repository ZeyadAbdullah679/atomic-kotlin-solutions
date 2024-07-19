// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    seconds * 1000L + hours * 3_600_000L + minutes * 60_000L

fun main() {
    println(convertToMilliseconds(1, 30, 0))
}