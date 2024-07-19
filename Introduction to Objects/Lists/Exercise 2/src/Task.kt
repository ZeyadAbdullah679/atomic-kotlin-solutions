// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
    var count = 0
    for (i in list) {
        if (i == number)
            count++
    }
    return count
}

fun main() {
    val list = IntList(listOf(1, 2, 3, 2))
    println(countOccurrences(list, 2))  // 2
}