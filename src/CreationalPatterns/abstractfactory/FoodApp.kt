package abstractfactory

import abstractfactory.mealfactory.LargeMealFactory
import abstractfactory.mealfactory.MealFactory
import abstractfactory.mealfactory.MediumMealFactory
import abstractfactory.mealfactory.SmallMealFactory
import abstractfactory.meals.Meal

class FoodApp {

    fun orderMeal(mealSize: MealSize) : Meal {
        return getFactory(mealSize).createMeal()
    }

    private fun getFactory(mealSize: MealSize) : MealFactory {
        return when (mealSize) {
            MealSize.SMALL -> SmallMealFactory()
            MealSize.MEDIUM -> MediumMealFactory()
            MealSize.LARGE -> LargeMealFactory()
        }
    }

}