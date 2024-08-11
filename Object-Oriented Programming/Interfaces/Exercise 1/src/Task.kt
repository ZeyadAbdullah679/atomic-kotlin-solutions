// Interfaces/Task1.kt
package interfacesExercise1

import atomictest.eq

interface Computer {
    fun calculateAnswer(): Int
}

class Cloud(val n: Int) : Computer {

    private val nodes = List(n) { Node(it) }

    override fun calculateAnswer(): Int {
        return nodes.sumOf { it.calculateAnswer() }
    }
}

data class Node(
    private val result: Int
) : Computer {
    override fun calculateAnswer(): Int {
        return result
    }
}

fun main() {
    // Cloud(10).calculateAnswer() eq 45
}