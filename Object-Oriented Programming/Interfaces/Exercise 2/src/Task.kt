// Interfaces/Task2.kt
package interfacesExercise2
import atomictest.eq

interface Pet {
  fun speak():String
}

class Dog: Pet {
    override fun speak(): String {
        return "Bark!"
    }

}

class Cat: Pet {
    override fun speak(): String {
        return "Meow!"
    }
}

class Hamster: Pet {
    override fun speak(): String {
        return "Squeak!"
    }
}

fun main() {
    println(listOf(Cat(), Dog(), Hamster()).map { it.speak() })
}