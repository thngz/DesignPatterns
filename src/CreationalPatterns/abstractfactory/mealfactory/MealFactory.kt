package abstractfactory.mealfactory

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda
import abstractfactory.meals.Meal

interface MealFactory {
  fun createBurger() : Burger

  fun createFries() : Fries

  fun createSoda() : Soda

  fun createMeal() : Meal
}