// Lists/Task1.kt
package listsExercise1

import atomictest.eq

fun findMax(list: IntList): Int {
    var mx = 0
    for (i in list) {
        if (i > mx)
            mx = i
    }
    return mx
}

fun main() {
    val list = IntList(listOf(1, 2, 3, 2))
    findMax(list) eq 3
}