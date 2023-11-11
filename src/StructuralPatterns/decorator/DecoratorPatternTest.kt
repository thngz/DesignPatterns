package decorator

import org.junit.Assert.assertEquals
import org.junit.Test

class DecoratorPatternTest {
    @Test
    fun createsSimpleWindow() {
        val t = SimpleWindow()
        assertEquals(t.getDescription(), "simple window")
    }

    @Test
    fun createsWindowWithVerticalScrollBar() {
        val t = VerticalScrollBar(SimpleWindow())
        assertEquals(t.getDescription(), "simple window, vertical scrollbar")
    }

    @Test
    fun createsWindowWithVerticalAndHorizontalScrollBar() {
        val t = HorizontalScrollBar(VerticalScrollBar(SimpleWindow()))
        assertEquals(t.getDescription(), "simple window, vertical scrollbar, horizontal scrollbar")
    }
}