// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
    var k = ""
    for (i in 0..s.lastIndex step 2)
        k += s[i]
    return k
}

fun main() {
    println(other("cement"))
}
/* Output:
cmn
*/