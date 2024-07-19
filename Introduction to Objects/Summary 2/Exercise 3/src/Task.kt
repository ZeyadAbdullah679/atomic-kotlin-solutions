// Summary2/Task3.kt
package summaryIIExercise3

import atomictest.*

class FixedSizeHolder(
    private val maxCapacity: Int
) {
    private val holder: MutableList<Any> = mutableListOf()

    val full: Boolean
        get() = holder.size == maxCapacity

    val size: Int
        get() = holder.size

    fun add(item: Any) {
        if (holder.size < maxCapacity)
            holder += item
        else
            throw IllegalStateException("The container is full")
    }
}

fun main() {

    val holder = FixedSizeHolder(2)
    holder.add("What is the answer?")
    holder.add(42)
    holder.full eq true
    holder.size eq 2
    capture {
        holder.add("!!!")
    } eq "IllegalStateException: The container is full"

}