package strategy.strategies

import strategy.Strategy

class AllCapsStrategy: Strategy {
    override fun execute(s: String): String {
       return s.uppercase()
    }
}