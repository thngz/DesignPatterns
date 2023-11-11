package mediator

class ChatRoom : Mediator {
    private val users = ArrayList<User>()

    override fun sendMessage(message: String, sender: User) {
        users.filter { it != sender }.forEach { it.receive(message) }
    }

    override fun addUser(user: User) {
        users.add(user)
    }

}