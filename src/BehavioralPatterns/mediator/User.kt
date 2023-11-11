package mediator

class User(private val userName: String, private val chatRoom: ChatRoom) {

    fun sendMessage(message: String) {
        chatRoom.sendMessage(message, this)
    }

    fun receive(message: String) {
        println("$userName received $message")
    }
}