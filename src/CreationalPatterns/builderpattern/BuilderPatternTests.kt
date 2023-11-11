package builderpattern


import builderpattern.builder.Burger
import builderpattern.builder.ConcreteBurgerBuilder
import org.junit.Test

class BuilderPatternTests {
    @Test
    fun createsBeefBurgerOnePatty() {
        val b = BurgerCreationDirector().makeNormalBurger()
        printBurger(b)
    }

    @Test
    fun createsChickenBurgerOnePatty() {
        val b = BurgerCreationDirector().makeNormalChickenBurger()
        printBurger(b)
    }

    @Test
    fun manuallyCreateDoubleBurger() {
        val b = ConcreteBurgerBuilder()
            .setPattyType(PattyType.BEEF)
            .addTomato()
            .addPatty()
            .addPatty()
            .addSalad()
            .getBurger()

        printBurger(b)
    }

    private fun printBurger(burger: Burger) {
       println("${burger.pattyCount}, ${burger.pattyType}, Tomato:  ${burger.tomato}, Salad: ${burger.salad}")
    }
}