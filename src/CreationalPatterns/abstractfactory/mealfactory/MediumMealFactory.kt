package abstractfactory.mealfactory

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda
import abstractfactory.food.small.MediumBurger
import abstractfactory.food.small.MediumFries
import abstractfactory.food.small.MediumSoda
import abstractfactory.meals.Meal
import abstractfactory.meals.MediumMeal

class MediumMealFactory : MealFactory {
    override fun createBurger(): Burger {
       return MediumBurger()
    }

    override fun createFries(): Fries {
        return MediumFries()
    }

    override fun createSoda(): Soda {
        return MediumSoda()
    }

    override fun createMeal(): Meal {
        return MediumMeal(createBurger(), createFries(), createSoda())
    }
}