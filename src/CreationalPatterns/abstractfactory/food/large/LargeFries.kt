package abstractfactory.food.small

import abstractfactory.food.Fries

class LargeFries : Fries {
    override fun dipToSauce(sauce: String) {
        println("Dipping large fries to $sauce")
    }

    override fun eat() {
       println("Eating large fries")
    }

}