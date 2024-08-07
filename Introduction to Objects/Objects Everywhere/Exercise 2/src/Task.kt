// ObjectsEverywhere/Task2.kt
package objectsEverywhereExercise2

import java.util.Locale

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
   isPalindrome(s.lowercase(Locale.getDefault()))

fun main() {
    println(isPalIgnoreCase("Mom"))  // true
}