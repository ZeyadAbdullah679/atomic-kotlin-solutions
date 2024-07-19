// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import typechecking.name

fun f(a:Int, b:Int) = a+b

fun g(a:String, b:String) = a+b

fun h() = print("h()")

fun main() {
  val f = f(2,3)
  val g = g("dddl","lksjdf")
  val h = h()
  println(f.name)
  println(g.name)
  println(h.name)
}