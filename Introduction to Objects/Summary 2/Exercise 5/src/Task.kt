// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg a: Int) {
    println("va1:")
    a.forEach {
        println(it)
    }
}

fun va2(vararg a: Int) {
    println("va2:")
    va1(*a)
}

fun main() {
  va1(1, 2, 3)
  va2(4, 5, 6)
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */