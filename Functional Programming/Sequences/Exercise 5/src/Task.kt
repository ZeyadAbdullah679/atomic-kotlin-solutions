// Sequences/Task5.kt
package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
    return lessons.groupBy { it.students.size }
        .maxByOrNull { it.key }!!.value.mapTo(mutableSetOf()) { it.instructor }
}