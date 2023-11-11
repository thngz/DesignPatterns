package adapter

class RoundHole(private val radius: Int) {
   fun fits(peg: RoundPeg): Boolean  {
      return radius >= peg.radius
   }
}