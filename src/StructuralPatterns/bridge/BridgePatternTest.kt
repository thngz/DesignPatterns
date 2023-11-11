package bridge

import bridge.colors.Black
import bridge.colors.Red
import bridge.colors.White
import bridge.shapes.Circle
import bridge.shapes.Square
import bridge.shapes.Triangle
import org.junit.Test

class BridgePatternTest {
    @Test
    fun makeColoredShapes() {
        val redCircle = Circle(Red())
        val blackSquare = Square(Black())
        val whiteTriangle = Triangle(White())

        redCircle.display()
        blackSquare.display()
        whiteTriangle.display()
    }
}