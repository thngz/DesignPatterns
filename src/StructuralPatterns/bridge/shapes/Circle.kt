package bridge.shapes

import bridge.colors.Color

class Circle(override val color: Color) : Shape {
    override fun display() {
        println("I am ${color.getColor()} circle ")
    }
}