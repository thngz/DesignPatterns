package abstractfactory.meals

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda

class SmallMeal(override val burger: Burger, override val fries: Fries, override val soda: Soda) : Meal
