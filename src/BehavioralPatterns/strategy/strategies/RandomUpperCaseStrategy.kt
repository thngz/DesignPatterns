package strategy.strategies

import strategy.Strategy

class RandomUpperCaseStrategy : Strategy {

    private fun diceRoll() = listOf(false,true).random()

    override fun execute(s: String): String {
        var result = ""
        for (c in s) {
           if (diceRoll()) {
               result+=c.uppercase()
           } else {
               result+=c
           }
        }
        return result
    }

}