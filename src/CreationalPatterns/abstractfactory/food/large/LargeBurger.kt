package abstractfactory.food.small

import abstractfactory.food.Burger

class LargeBurger : Burger {
    override fun eat() {
       println("Eating large burger")
    }

}