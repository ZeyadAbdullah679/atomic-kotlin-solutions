// Overloading/Task3.kt
package overloadingExercise3

import atomictest.eq

fun List<Int>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    return joinTo(StringBuilder(), separator, prefix, postfix).toString()
}

fun List<Int>.myJoinToString(
    separator: String,
    prefix: String,
    postfix: String
): String {
    return "MY: " + joinToString(separator, prefix, postfix)
}

fun List<Int>.myJoinToString(separator: String, prefix: String): String {
    return "MY: " + joinToString(separator, prefix)
}

fun List<Int>.myJoinToString(separator: String): String {
    return "MY: " + joinToString(separator)
}

fun List<Int>.myJoinToString(): String {
    return "MY: " + joinToString()
}


fun main() {
    val list = listOf(1, 2, 3)
    list.myJoinToString() eq
            "MY: 1, 2, 3"
    list.myJoinToString(separator = "|") eq
            "MY: 1|2|3"
    list.myJoinToString(separator = "..", prefix = "Numbers: ") eq
            "MY: Numbers: 1..2..3"
}