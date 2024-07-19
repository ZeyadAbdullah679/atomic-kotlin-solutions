// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
    var x = 0
    for (i in start..end) {
        x++
        if (x % 5 == 0)
            println(i)
    }
}

fun main() {
    everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/