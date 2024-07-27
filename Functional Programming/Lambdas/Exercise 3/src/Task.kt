// Lambdas/Task3.kt
package lambdasExercise3

import atomictest.eq

data class Student(val id: Int, val name: String)

fun registerStudents(names: List<String>, startId: Int = 0): List<Student> =
    names.mapIndexed { index, s -> Student(startId + index, s) }

fun main() {
    val students = listOf("Alice", "Bob")
    registerStudents(students) eq
            listOf(Student(0, "Alice"), Student(1, "Bob"))
    registerStudents(students, startId = 10) eq
            listOf(Student(10, "Alice"), Student(11, "Bob"))
}