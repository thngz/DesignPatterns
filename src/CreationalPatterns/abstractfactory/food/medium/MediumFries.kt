package abstractfactory.food.small

import abstractfactory.food.Fries

class MediumFries : Fries {

    override fun dipToSauce(sauce: String) {
        println("Dipping medium fries to $sauce")
    }

    override fun eat() {
        println("Eating medium fries")
    }
}