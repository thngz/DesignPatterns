package state.marios

import state.Game
import state.Mario
import state.PowerUp

class CapeMario(override val game: Game) : Mario {

    override fun canHighJump(): Boolean {
        return true
    }

    override fun canFloat(): Boolean {
        return true
    }

    override fun canShootFireBall(): Boolean {
        return false
    }

    override fun isSuper(): Boolean {
        return true
    }

    override fun eatPowerUp(p: PowerUp) {
        when (p) {
            PowerUp.SHROOM -> game.changeMario(CapeMario(game))
            PowerUp.CAPE_FEATHER -> game.changeMario(CapeMario(game))
            PowerUp.FIRE_FLOWER -> game.changeMario(FireMario(game))
        }
    }

    override fun getIdentity() {
       println("I am cape mario")
    }
}