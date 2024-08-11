// Interfaces/Task3.kt
package interfacesExercise3

import atomictest.eq

interface Pet {
    val sound: String
}

class Dog() : Pet {
    override val sound: String
        get() = "Bark!"
}

class Cat() : Pet {
    override val sound: String
        get() = "Meow!"
}

class Hamster() : Pet {
    override val sound: String
        get() = "Squeak!"

}

fun main() {
    println(listOf(Dog(), Cat(), Hamster()).map { it.sound })
}