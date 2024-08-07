// Overloading/Task1.kt
package overloadingExercise1

class Dog {
    fun bark(n: Int) {
       bark(n, "woof")
    }

    fun bark(n: Int, say: String) {
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