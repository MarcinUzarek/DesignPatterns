package decorator_pattern.my_decorator.meal_decorators;

import decorator_pattern.my_decorator.meals.Meal;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Adding chicken");
    }
}
