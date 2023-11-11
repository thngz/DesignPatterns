package abstractfactory.meals

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda

data class LargeMeal(override val burger: Burger, override val fries: Fries, override val soda: Soda) : Meal