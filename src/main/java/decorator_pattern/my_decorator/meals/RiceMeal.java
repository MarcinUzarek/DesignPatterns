package decorator_pattern.my_decorator.meals;

public class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("Preparing dish with rice");
    }
}
