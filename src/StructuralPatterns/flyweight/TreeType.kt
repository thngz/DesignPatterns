package flyweight
// Tree's intrinsic data (usually big in terms of memory)
class TreeType(val name: String, val color: String, val texture: String) {
    fun draw(canvas: String, x: Int, y: Int) {
        println("Drawing to $canvas, at ($x, $y)")
    }
}