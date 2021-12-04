package decorator_pattern.my_decorator.meals;

public class PotatoMeal extends Meal{

    @Override
    public void prepareMeal() {
        System.out.println("Preparing meal with potatoes");
    }
}
