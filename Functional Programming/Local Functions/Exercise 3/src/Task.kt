// LocalFunctions/Task3.kt
package localFunctionsExercise3

import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var st: Int? = null
    return Pair(
        fun(s: Int) {
            st = s
        },
        fun(): Int? {
            if (st != null) {
                val temp = st
                st = null
                return temp
            } else
                return null
        }
    )
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}