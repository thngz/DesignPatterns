package strategy

import org.junit.Test
import strategy.strategies.AllCapsStrategy
import strategy.strategies.RandomUpperCaseStrategy

class StrategyPatternTests {
    @Test
    fun tests() {
        val app = CapitalizationApp(AllCapsStrategy())

        println(app.applyCapitalizationToString("foo bar"))

        app.setCapitalizationStrategy(RandomUpperCaseStrategy())

        println(app.applyCapitalizationToString("foo bar"))
    }
}