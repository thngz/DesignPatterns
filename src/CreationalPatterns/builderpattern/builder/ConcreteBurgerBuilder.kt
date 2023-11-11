package builderpattern.builder

import builderpattern.PattyType

class ConcreteBurgerBuilder : BurgerBuilder {

    private var burger = Burger()

    override fun setPattyType(p: PattyType) = apply {
        burger.pattyType = p
    }

    override fun addPatty() = apply {
        burger.pattyCount++
    }

    override fun addSalad() = apply {
        burger.salad = true
    }

    override fun addTomato() = apply {
        burger.tomato = true
    }

    override fun reset() {
        burger = Burger()
    }

    override fun getBurger(): Burger {
        val product = burger
        reset()
        return product
    }
}