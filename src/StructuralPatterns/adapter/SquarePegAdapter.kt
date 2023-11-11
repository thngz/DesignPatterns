package adapter

import kotlin.math.sqrt

class SquarePegAdapter(peg: SquarePeg): RoundPeg(peg.width * sqrt(2.0) / 2) {
}