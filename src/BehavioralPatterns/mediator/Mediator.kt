package mediator

interface Mediator {
    fun sendMessage(message: String, sender: User)
    fun addUser(user: User)
}