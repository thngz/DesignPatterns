package state

import state.marios.BasicMario

class Game {
    var mario: Mario = BasicMario(this)
    fun changeMario(mario: Mario) {
        this.mario = mario
    }

}