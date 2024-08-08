// FoldingLists/Task2.kt
package foldingListsExercise2

import atomictest.eq

fun <T> List<T>.count(predicate: (T) -> Boolean): Int =
    fold(0) {acc, t -> if(predicate(t)) acc + 1 else acc }

fun main() {
    val list = listOf(1, -2, 3)
    list.count { it > 0 } eq 2
}