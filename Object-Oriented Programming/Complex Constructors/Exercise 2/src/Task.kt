// ComplexConstructors/Exercise2.kt
package complexConstructorsExercise2

class SumChars(text: String) {
    val sum: Int

    init {
        sum = text.chars().sum()
    }
}

fun main() {
    // SumChars("What?").sum eq 467
}