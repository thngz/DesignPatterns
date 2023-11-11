package flyweight

//Tree's extrinsic state
class Tree(val x: Int, val y: Int, private val type: TreeType) {
    fun draw(canvas: String) {
        type.draw(canvas, x, y)
    }
}