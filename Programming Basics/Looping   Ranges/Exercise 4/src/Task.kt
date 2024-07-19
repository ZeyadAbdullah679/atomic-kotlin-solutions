// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for(i in 1..n){
    for(j in 1..i){
      print('#')
    }
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/