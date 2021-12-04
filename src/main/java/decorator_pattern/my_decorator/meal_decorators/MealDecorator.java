package decorator_pattern.my_decorator.meal_decorators;

import decorator_pattern.my_decorator.meals.Meal;

public abstract class MealDecorator extends Meal {

    Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
