// CreatingClasses/Task5.kt
package creatingClassesExercise5

import java.util.Locale

fun cap(s: String) = s.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

fun main() {
  println(cap("hi!"))
  println(cap("Hi!"))
}
/* Output:
Hi!
Hi!
 */