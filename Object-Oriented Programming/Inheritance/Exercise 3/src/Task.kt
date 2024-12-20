// Inheritance/Task3.kt
package inheritanceExercise3

import atomictest.eq

open class Game {
    val initOrder = mutableListOf<String>()

    init {
        initOrder.add("Game")
    }
}

open class BoardGame : Game() {
    init {
        initOrder.add("BoardGame")
    }
}

class Chess : BoardGame() {
    init {
        initOrder.add("Chess")
    }
}

fun main() {
    // Chess().initOrder eq "[Game, BoardGame, Chess]"
}