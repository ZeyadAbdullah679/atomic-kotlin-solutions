// NumberTypes/Task3.kt
package numberTypesExercise3

fun convertFahrenheitToCelsius(f: Int): Double =
    (f - 32) * 5 / 9.0

fun convertCelsiusToFahrenheit(c: Int): Double =
    9 / 5.0 * c + 32

fun main() {
    println(convertFahrenheitToCelsius(68)) // 20.0
    println(convertCelsiusToFahrenheit(20)) // 68.0
}