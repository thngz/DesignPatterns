package bridge.shapes

import bridge.colors.Color

class Square(override val color: Color) : Shape {
    override fun display() {
        println("I am ${color.getColor()} square")
    }
}