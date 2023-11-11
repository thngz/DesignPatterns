package abstractfactory.food.small

import abstractfactory.food.Burger

class SmallBurger : Burger {
    override fun eat() {
       println("Eating small burger")
    }
}