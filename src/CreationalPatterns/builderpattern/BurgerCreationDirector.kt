package builderpattern

import builderpattern.builder.Burger
import builderpattern.builder.ConcreteBurgerBuilder

class BurgerCreationDirector {
    fun makeNormalBurger(): Burger {
        return ConcreteBurgerBuilder()
            .addPatty()
            .setPattyType(PattyType.BEEF)
            .addSalad()
            .addTomato()
            .getBurger()
    }

    fun makeNormalChickenBurger() : Burger {
        return ConcreteBurgerBuilder()
            .addPatty()
            .setPattyType(PattyType.CHICKEN)
            .addSalad()
            .addTomato()
            .getBurger()
    }

}