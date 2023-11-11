package bridge.shapes

import bridge.colors.Color


class Triangle(override val color: Color) : Shape {
    override fun display() {
        println("I am ${color.getColor()} triangle ")
    }
}