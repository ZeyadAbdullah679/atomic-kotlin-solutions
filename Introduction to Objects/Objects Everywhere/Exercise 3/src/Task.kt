// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean =
    isPalIgnoreCase(s.filter { it in 'a'..'z' || it in 'A'..'Z' })


fun main() {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}