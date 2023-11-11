package memento

//Originator - Thing which state we want to snapshot
class Player(var x: Int, var y: Int, var health: Int) {

    inner class Memento(private val x: Int, private val y: Int, private val health: Int) {
        // the memento which saves the snapshot
        fun getSavedX(): Int {return x}
        fun getSavedY(): Int {return y}
        fun getSavedHealth(): Int {return health}
    }

    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun save(): Memento {
        return Memento(x, y, health)
    }

    fun restore(m: Memento) {
        this.x = m.getSavedX()
        this.y = m.getSavedY()
        this.health = m.getSavedHealth()
    }
}