// Varargs/ListOf.kt
import atomictest.eq

fun main(args: Array<String>) {
  println(args.size)
  listOf(1) eq "[1]"
  listOf("a", "b") eq "[a, b]"
}