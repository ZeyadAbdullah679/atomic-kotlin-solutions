// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1


class Rectangle(
    val side1: Double = 1.0,
    val side2: Double = 2.0,
    val color: String = "yellow"
) {
    override fun toString(): String {
        return "$color rectangle $side1 x $side2"
    }
}

fun main() {
    println(
        Rectangle(
            side1 = 1.0,
            side2 = 2.0,
            color = "yellow"
        )
    )
    println(
        Rectangle(
            1.0,
            2.0,
            color = "yellow"
        )
    )

    // TODO
}