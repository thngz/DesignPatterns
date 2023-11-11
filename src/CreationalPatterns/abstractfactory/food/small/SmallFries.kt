package abstractfactory.food.small

import abstractfactory.food.Fries

class SmallFries : Fries {
    override fun dipToSauce(sauce: String) {
        println("Dipping small fries to $sauce")
    }

    override fun eat() {
       println("Eating small fries")
    }
}