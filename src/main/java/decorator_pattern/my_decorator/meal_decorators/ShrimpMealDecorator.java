package decorator_pattern.my_decorator.meal_decorators;

import decorator_pattern.my_decorator.meals.Meal;

public class ShrimpMealDecorator extends MealDecorator{

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Adding shrimp");
    }
}
