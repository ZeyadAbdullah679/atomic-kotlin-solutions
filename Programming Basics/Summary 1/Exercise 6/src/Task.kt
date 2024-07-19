// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
    val k = s.filterNot { it == ' ' }
        .forEachIndexed { index, c ->
            if ((index + 1) % 5 == 0) println(c)
        }

}

fun main() {
    everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/