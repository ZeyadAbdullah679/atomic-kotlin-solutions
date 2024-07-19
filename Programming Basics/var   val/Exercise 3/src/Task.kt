// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val z = x
    x = y
    y = z
  println(x)
  println(y)
}