package strategy.strategies

import strategy.Strategy

class AllLowerCaseStrategy: Strategy {
    override fun execute(s: String): String {
        return s.lowercase()
    }
}