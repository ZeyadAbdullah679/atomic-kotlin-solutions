// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidString(s:String): Boolean{
    for(i in s.substring(1, s.length)){
        if(!i.isLetterOrDigit())
            return false
    }
    return true
}

fun isValidIdentifier(s: String): Boolean {
    return s.isNotEmpty() && (s[0].isLetter() || s[0]=='_') && isValidString(s)
}

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}