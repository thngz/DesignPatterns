package flyweight

import org.junit.Test

class FlyweightPatternTests {
    @Test
    fun drawTrees() {
        val forest = Forest()
        for (i in 1..100) {
            forest.plantTree(i, i, "Oak", "Green", "Pixelated")
        }

        forest.draw("Hillside")
    }

}