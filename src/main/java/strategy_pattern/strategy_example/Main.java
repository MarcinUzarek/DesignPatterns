package strategy_pattern.strategy_example;

import strategy_pattern.strategy_example.chef.Chef;
import strategy_pattern.strategy_example.egg_cooker.HardBoilEggCooker;
import strategy_pattern.strategy_example.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        //nowe zamowienie jajka na twardo

        Chef chef = new Chef("Michał");
        chef.setEggCooker(new HardBoilEggCooker());
        chef.cook();

        //nowe zamowienie jajka na miekko
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
