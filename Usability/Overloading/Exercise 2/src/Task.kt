// Overloading/Task2.kt
package overloadingExercise2

class Dog {
    fun bark(n: Int, say: String = "woof") {
        repeat(n) {
            println(say)
        }
    }
}

fun main() {
    val dog = Dog()
    dog.bark(3)
    dog.bark(2, "wow")
}
/* Expected output:
woof
woof
woof
wow
wow
 */