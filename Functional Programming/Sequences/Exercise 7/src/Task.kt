// Sequences/Task7.kt
package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
    return generateSequence(3) {
        var num = it + 2
        while (num.toString().contains('1')) {num += 2}
        num
    }
}

fun main() {
    println(oddWithoutDigitOne().take(20).sum())
}