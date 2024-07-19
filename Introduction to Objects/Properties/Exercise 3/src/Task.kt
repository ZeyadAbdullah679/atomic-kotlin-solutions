// Properties/Task3.kt
package propertiesExercise3

import kotlin.math.abs

class Robot {
    var x = 0
    var y = 0

    fun right(steps: Int) {
        x = (x + steps) % 100
    }

    fun left(steps: Int) {
        if (x - steps < 0)
            x = 100 - abs(x - steps) % 100
        else
            x -= steps
    }

    fun down(steps: Int) {
        y = (y + steps) % 100
    }

    fun up(steps: Int) {
        if (y - steps < 0)
            y = 100 - abs(y - steps) % 100
        else
            y -= steps
    }

    fun getLocation(): String = "($x, $y)"
}

fun main() {
    val robot = Robot()
    println(robot.getLocation())
    robot.up(1)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/
