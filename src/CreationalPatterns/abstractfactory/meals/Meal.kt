package abstractfactory.meals

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda

interface Meal {

    val burger: Burger
    val fries: Fries
    val soda: Soda

}