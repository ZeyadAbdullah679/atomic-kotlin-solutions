// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
    var sum = 0
    var i = 0
    while (i <= n) {
        sum += i
        i += 2
    }
    return sum
}

fun main() {
    println(sumOfEven(10))  // 30
}