package flyweight

class Forest {
    private val trees = ArrayList<Tree>()

    fun plantTree(x: Int, y: Int, name: String, color: String, texture: String) {
        val type = TreeFactory().getTreeType(name, color, texture)
        val tree = Tree(x, y, type)
        trees.add(tree)
    }

    fun draw(canvas: String) {
        trees.forEach { it.draw(canvas) }
    }
}