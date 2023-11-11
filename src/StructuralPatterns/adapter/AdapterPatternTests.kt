package adapter

import org.junit.Test

class AdapterPatternTests {

    @Test
    fun roundPegFitsIntoHole() {
        val hole = RoundHole(5)
        val roundPeg = RoundPeg(5.0)
        assert(hole.fits(roundPeg))
    }

    @Test
    fun fitIntoHoleUsingAdapter() {
        val hole = RoundHole(5)
        val squarePeg = SquarePeg(5.0)
        val squarePegAdapter = SquarePegAdapter(squarePeg)
        assert(hole.fits(squarePegAdapter))
    }
}