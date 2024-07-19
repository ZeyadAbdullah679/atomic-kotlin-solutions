// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var sum = 0
  for(i in 0..n step 2) {
    sum += i
  }
  return sum
}

fun main() {
  println(sumOfEven(10))  // 30
}