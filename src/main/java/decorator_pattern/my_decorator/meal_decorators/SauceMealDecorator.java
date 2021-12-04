package decorator_pattern.my_decorator.meal_decorators;

import decorator_pattern.my_decorator.meals.Meal;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    private void addSauce(){
        System.out.println("Adding sauce");
    }
}
