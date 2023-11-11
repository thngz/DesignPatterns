package builderpattern.builder

import builderpattern.PattyType

interface BurgerBuilder {
    fun setPattyType(p : PattyType) : BurgerBuilder
    fun addPatty() : BurgerBuilder
    fun addSalad() : BurgerBuilder
    fun addTomato() : BurgerBuilder

    fun reset()
    fun getBurger() : Burger
}