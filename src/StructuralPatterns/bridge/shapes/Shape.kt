package bridge.shapes

import bridge.colors.Color

interface Shape {
    val color: Color
    fun display()
}