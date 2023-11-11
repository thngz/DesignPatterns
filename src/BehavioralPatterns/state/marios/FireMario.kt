package state.marios

import state.Game
import state.Mario
import state.PowerUp

class FireMario(override val game: Game) : Mario {
    override fun canHighJump(): Boolean {
       return true
    }

    override fun canFloat(): Boolean {
        return false
    }

    override fun canShootFireBall(): Boolean {
        return true
    }

    override fun isSuper(): Boolean {
        return true
    }

    override fun eatPowerUp(p: PowerUp) {
       when(p) {
           PowerUp.SHROOM -> game.changeMario(FireMario(game))
           PowerUp.FIRE_FLOWER -> game.changeMario(FireMario(game))
           PowerUp.CAPE_FEATHER -> game.changeMario(CapeMario(game))
       }
    }

    override fun getIdentity() {
        println("I am fire mario")
    }
}