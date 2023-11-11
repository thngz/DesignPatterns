package abstractfactory.mealfactory

import abstractfactory.food.Fries
import abstractfactory.food.Soda
import abstractfactory.food.small.LargeBurger
import abstractfactory.food.small.LargeFries
import abstractfactory.food.small.LargeSoda
import abstractfactory.meals.LargeMeal
import abstractfactory.meals.Meal

class LargeMealFactory : MealFactory {
    override fun createBurger(): LargeBurger {
        return LargeBurger()
    }

    override fun createFries(): Fries {
        return LargeFries()
    }

    override fun createSoda(): Soda {
        return LargeSoda()
    }

    override fun createMeal(): Meal {
        return LargeMeal(createBurger(), createFries(), createSoda())
    }
}