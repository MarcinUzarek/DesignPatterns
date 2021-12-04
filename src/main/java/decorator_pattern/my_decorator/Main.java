package decorator_pattern.my_decorator;

import decorator_pattern.my_decorator.meal_decorators.ChickenMealDecorator;
import decorator_pattern.my_decorator.meal_decorators.SauceMealDecorator;
import decorator_pattern.my_decorator.meal_decorators.ShrimpMealDecorator;
import decorator_pattern.my_decorator.meals.Meal;
import decorator_pattern.my_decorator.meals.PotatoMeal;
import decorator_pattern.my_decorator.meals.RiceMeal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();

    }
}
