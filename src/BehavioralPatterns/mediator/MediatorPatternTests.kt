package mediator

import org.junit.Test

class MediatorPatternTests {
    @Test
    fun usersReceiveMessage() {
        val chatRoom = ChatRoom()
        val user1 = User("foo", chatRoom)
        val user2 = User("bar", chatRoom)
        val user3 = User("baz", chatRoom)

        chatRoom.addUser(user1)
        chatRoom.addUser(user2)
        chatRoom.addUser(user3)

        user1.sendMessage("Ping")
    }
}