// Recursion/Task2.kt
package recursionExercise2

import atomictest.eq

fun factorial(n: Long): Long {
    tailrec fun fact(n: Long, acc: Long): Long {
        if (n == 1L) return acc
        return fact(n - 1, acc * n)
    }
    return fact(n, 1L)
}

fun main() {
    factorial(3) eq 6
    factorial(4) eq 24
    factorial(11) eq 39916800
}