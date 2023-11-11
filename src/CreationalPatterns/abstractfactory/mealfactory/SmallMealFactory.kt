package abstractfactory.mealfactory

import abstractfactory.food.Burger
import abstractfactory.food.Fries
import abstractfactory.food.Soda
import abstractfactory.food.small.SmallBurger
import abstractfactory.food.small.SmallFries
import abstractfactory.food.small.SmallSoda
import abstractfactory.meals.Meal
import abstractfactory.meals.SmallMeal

class SmallMealFactory : MealFactory {
    override fun createBurger(): Burger {
        return SmallBurger()
    }

    override fun createFries(): Fries {
        return SmallFries()
    }

    override fun createSoda(): Soda {
        return SmallSoda()
    }

    override fun createMeal(): Meal {
        return SmallMeal(createBurger(), createFries(), createSoda())
    }
}