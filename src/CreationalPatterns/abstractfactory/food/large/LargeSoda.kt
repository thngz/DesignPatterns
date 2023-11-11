package abstractfactory.food.small

import abstractfactory.food.Soda

class LargeSoda : Soda {
    override fun drink() {
       println("Slurping on large drink")
    }
}