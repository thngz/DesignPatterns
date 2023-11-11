package state

import org.junit.Test
import state.marios.BasicMario

class StatePatternTests {
    @Test
    fun marioToSuperMarioToFireMario() {
        val game = Game()

        game.mario.eatPowerUp(PowerUp.SHROOM)
        assert(game.mario.isSuper())

        game.mario.eatPowerUp(PowerUp.FIRE_FLOWER)

        assert(game.mario.isSuper())
        assert(game.mario.canShootFireBall())
    }

    @Test
    fun marioToCapeMario() {
        val game = Game()
        game.mario.eatPowerUp(PowerUp.CAPE_FEATHER)
        assert(game.mario.canFloat())
    }

    @Test
    fun capeMarioToFireMario() {
        val game = Game()
        game.mario.eatPowerUp(PowerUp.CAPE_FEATHER)

        assert(game.mario.canFloat())
        game.mario.eatPowerUp(PowerUp.FIRE_FLOWER)

        assert(game.mario.canShootFireBall())

        game.mario.eatPowerUp(PowerUp.FIRE_FLOWER)
        assert(game.mario.canShootFireBall())
    }
}