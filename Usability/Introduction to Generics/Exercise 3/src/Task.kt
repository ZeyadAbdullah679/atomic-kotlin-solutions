// IntroGenerics/Task3.kt
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<T> {
    private val map = mutableMapOf<T, Int>()
    fun add(element: T) {
        map[element] = map.getOrDefault(element, 0) + 1
    }
    fun count(element: T) = map.getOrDefault(element, 0)
    fun toSet() = map.keys
}

fun main() {
/*
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
*/
}