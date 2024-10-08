// Visibility/Task3.kt
package constrainingVisibilityExercise3

class Robot(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {
    private fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }


    fun right(steps: Int) {
        if (steps > 0) {
            x += steps
            x = crossBoundary(x)
        } else {
            println("steps argument must be positive, is $steps")
        }
    }

    fun left(steps: Int) {
        if (steps > 0) {
            x -= steps
            x = crossBoundary(x)
        } else {
            println("steps argument must be positive, is $steps")
        }
    }

    fun down(steps: Int) {
        if (steps > 0) {
            y += steps
            y = crossBoundary(y)
        } else {
            println("steps argument must be positive, is $steps")
        }
    }

    fun up(steps: Int) {
        if (steps > 0) {
            y -= steps
            y = crossBoundary(y)
        } else {
            println("steps argument must be positive, is $steps")
        }
    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
    val robot = Robot(10, 1, 1)
    robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/