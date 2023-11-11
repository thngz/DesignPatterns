package composite

import org.junit.Test

class CompositePatternTests {
    @Test
    fun worksWithAllGraphicTypes() {
        val compound = CompoundGraphic()
        compound.add(Dot(1, 2))
        compound.add(Circle(5, 3, 10))

        val components = listOf(compound, Dot(3, 5), Circle(7, 8, 15))

        components.forEach { it.draw() }
    }
}