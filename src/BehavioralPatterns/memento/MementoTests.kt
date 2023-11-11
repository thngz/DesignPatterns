package memento

import org.junit.Test

class MementoTests {
    @Test
    fun savesSnapShot() {
        val player = Player(0, 0, 100)

        //player moves and takes damage
        player.move(1,1)
        player.health = 95

        // player saves
        val playerSave = player.save()

        val newSessionPlayer = Player(0, 0, 100)
        newSessionPlayer.restore(playerSave)

        assert(newSessionPlayer.x == 1)
        assert(newSessionPlayer.y == 1)
        assert(newSessionPlayer.health == 95)
    }
}