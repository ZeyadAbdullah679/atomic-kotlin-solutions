// Summary2/Task2.kt
package summaryIIExercise2

import atomictest.eq

class Boring2(
    val a: Double,
    val b: String,
    val c: Int
) {
    fun a() = a
    fun b() = b
    fun c() = c
}

fun main() {
    val boring = Boring2(1.1, "abc", 42)
    boring.a() eq 1.1
    boring.b() eq "abc"
    boring.c() eq 42
}