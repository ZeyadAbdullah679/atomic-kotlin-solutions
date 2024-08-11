// ComplexConstructors/Exercise3.kt
package complexConstructorsExercise3

import atomictest.eq

class MultipleInit {
    val initOrder = mutableListOf<String>()

    init {
        initOrder.add("one")
    }

    init {
        initOrder.add("two")
    }

    init {
        initOrder.add("three")
    }
}

fun main() {
    MultipleInit().initOrder eq "[one, two, three]"
}