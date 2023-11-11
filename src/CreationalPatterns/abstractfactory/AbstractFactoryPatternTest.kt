package abstractfactory

import abstractfactory.mealfactory.SmallMealFactory
import abstractfactory.meals.Meal
import org.junit.Test

class AbstractFactoryPatternTest {

    @Test
    fun makeSmallMeal() {
        val foodApp = FoodApp()

        val meal = foodApp.orderMeal(MealSize.SMALL)

//        val smallMealF = SmallMealFactory()
//        val smallMeal = smallMealF.createMeal()
//        printMeal(smallMeal)

        printMeal(meal)
    }


    @Test
    fun makeMediumMeal() {
        val foodApp = FoodApp()

        val meal = foodApp.orderMeal(MealSize.MEDIUM)
        printMeal(meal)
    }

    @Test
    fun makeLargeMeal() {

        val foodApp = FoodApp()

        val meal = foodApp.orderMeal(MealSize.LARGE)
        printMeal(meal)
    }

    private fun printMeal(meal: Meal): String {
        return "${meal.burger.eat()}, ${meal.fries.eat()}, ${meal.soda.drink()}"
    }
}