// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
    var x = ""
    for (c in 'a'..'z') x += c
    return x
}

fun main() {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}