package strategy

class CapitalizationApp(private var strategy: Strategy) {

    fun setCapitalizationStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun applyCapitalizationToString(s: String): String {
        return strategy.execute(s)
    }
}