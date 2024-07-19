// Sets/Task3.kt
package setsExercise3

import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

fun countPercent(cart: Set<String>, category: Set<String>) =
    (cart intersect category).size * 100.0 / cart.size

fun percentMeat(groceryCart: Set<String>): Double =
    countPercent(groceryCart, meats)

fun percentFruit(groceryCart: Set<String>): Double =
    countPercent(groceryCart, fruits)

fun percentVeggies(groceryCart: Set<String>): Double =
    countPercent(groceryCart, vegetables)

fun percentOther(groceryCart: Set<String>): Double =
    100 - countPercent(groceryCart, meats union fruits union vegetables)

fun main() {
    val groceryCart = setOf(
        "apple", "pretzels", "bread", "orange", "beef",
        "beans", "asparagus", "sweet potatoes", "spinach", "carrots"
    )

    percentMeat(groceryCart) eq 10.0
    percentFruit(groceryCart) eq 20.0
    percentVeggies(groceryCart) eq 50.0
    percentOther(groceryCart) eq 20.0
}