package abstractfactory.food.small

import abstractfactory.food.Soda

class SmallSoda : Soda {
    override fun drink() {
       println("Slurping on small drink")
    }
}