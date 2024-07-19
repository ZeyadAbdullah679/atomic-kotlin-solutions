// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
    var spaces = n - 1
    var hashes = 1
    for (i in 1..n) {
        for (j in 1..spaces) print(' ')
        for (k in 1..hashes) print('#')
        println()
        spaces--
        hashes++
    }
}

fun main() {
    printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/