// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3

import atomictest.eq

class MessageStorage {
    private val _messages: MutableList<String> = mutableListOf()
    val messages: List<String>
        get() = _messages

    fun addMessage(message: String){
        _messages.add(message)
    }
}

fun main() {
    /*
      val messageStorage = MessageStorage()
      messageStorage.addMessage("first")
      messageStorage.addMessage("second")
      messageStorage.messages eq listOf("first", "second")
      // doesn't compile:
    //  messageStorage.messages.remove("first")
    */
}