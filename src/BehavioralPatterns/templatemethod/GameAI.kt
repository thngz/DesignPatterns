package templatemethod

abstract class GameAI {
    fun turn() {
        collectResources()
        buildStructures()
        buildUnits()
        attack()
    }

    fun collectResources() {
        println("default gather")
    }

    abstract fun buildStructures()
    abstract fun buildUnits()

    fun attack() {
        println("default attack")
    }
}