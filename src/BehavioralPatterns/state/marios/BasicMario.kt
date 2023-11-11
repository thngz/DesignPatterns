package state.marios

import state.Game
import state.Mario
import state.PowerUp

class BasicMario(override val game: Game) : Mario {
    override fun canHighJump(): Boolean {
        return false
    }

    override fun canFloat(): Boolean {
        return false
    }

    override fun canShootFireBall(): Boolean {
        return false
    }

    override fun isSuper(): Boolean {
        return false
    }

    override fun eatPowerUp(p: PowerUp) {
        when (p) {
            PowerUp.SHROOM -> game.changeMario(SuperMario(game))
            PowerUp.FIRE_FLOWER -> game.changeMario(FireMario(game))
            PowerUp.CAPE_FEATHER -> game.changeMario(CapeMario(game))
        }
    }

    override fun getIdentity() {
       println("I am basic mario")
    }
}