package composite

class Circle(override val x: Int, override val y: Int, val radius: Int): Dot(x, y) {
    override fun draw() {
       println("Drawing circle with radius of $radius to ($x, $y)")
    }
}