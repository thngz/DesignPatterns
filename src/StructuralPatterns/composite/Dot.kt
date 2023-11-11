package composite

//Leaf object
open class Dot(open val x: Int, open val y: Int) : Graphic {
    override fun move(x: Int, y: Int) {
        this.x + x
        this.y + y
    }
    override fun draw() {
        println("Drawing dot to ($x, $y)")
    }
}