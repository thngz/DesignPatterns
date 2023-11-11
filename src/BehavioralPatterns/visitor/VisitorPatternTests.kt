package visitor

import org.junit.Test

class VisitorPatternTests {

    @Test
    fun testVisitor() {
        val s = ShapeVisitorPrinter()
        val shapes = listOf(Circle(), Dot(), Rectangle())

        shapes.forEach { it.accept(s) }
    }
}