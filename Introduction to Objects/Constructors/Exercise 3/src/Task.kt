// Constructors/Task3.kt
package constructorsExercise3

class Robot(val fieldSize: Int, var x: Int, var y: Int) {
    fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }

    fun goRight(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun goLeft(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun goDown(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun goUp(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"

    /* Implement toString */
    override fun toString(): String {
        return "Robot(x=$x, y=$y)"
    }
}

fun main() {
    val robot = Robot(10, 1, 1)
    println(robot)
}
/* Output:
Robot(x=1, y=1)
*/