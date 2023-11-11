package prototype

import org.junit.Test

class PrototypePatternTests {
    @Test
    fun cloneTest() {
        val circle = Circle()
        circle.x = 10
        circle.y = 10
        circle.radius = 20
        circle.color = "red"

        val circleClone = circle.clone()

        val rectangle = Rectangle()
        rectangle.height = 5
        rectangle.width = 5
        rectangle.color = "blue"

        val rectangleClone = rectangle.clone()

        val shapes = listOf(circle, rectangle)
        val cloneShapes = listOf(circleClone, rectangleClone)

        assert(shapes == cloneShapes)
    }
}