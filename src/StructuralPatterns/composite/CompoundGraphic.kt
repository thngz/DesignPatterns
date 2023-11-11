package composite

class CompoundGraphic() : Graphic {
    private val children = ArrayList<Graphic>()

    fun add(child: Graphic) {
        children.add(child)
    }

    override fun move(x: Int, y: Int) {
        children.forEach { it.move(x, y) }
    }

    override fun draw() {
        children.forEach { it.draw() }
    }
}