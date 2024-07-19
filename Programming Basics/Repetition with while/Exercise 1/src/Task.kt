// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s: String) {
    var n = 0
    while (n != s.length) {
        println(s[n])
        n++
    }
}

fun main() {
    displayContent("abc")
}
/* Expected output:
a
b
c
*/