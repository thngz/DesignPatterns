package state.marios

import state.Game
import state.Mario
import state.PowerUp

class SuperMario(override val game: Game) : Mario {
    override fun canHighJump(): Boolean {
       return true
    }

    override fun canFloat(): Boolean {
        return false
    }

    override fun canShootFireBall(): Boolean {
        return false
    }

    override fun isSuper(): Boolean {
        return true
    }

    override fun eatPowerUp(p: PowerUp) {
        when(p) {
            PowerUp.SHROOM -> game.changeMario(SuperMario(game))
            PowerUp.CAPE_FEATHER -> game.changeMario(CapeMario(game))
            PowerUp.FIRE_FLOWER -> game.changeMario(FireMario(game))
        }
    }

    override fun getIdentity() {
       println("I am super mario")
    }

}