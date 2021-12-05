package strategy_pattern.strategy_example.egg_cooker;

public class HardBoilEggCooker implements EggCooker{

    @Override
    public void cookEgg() {
        System.out.println("Gotuje jaja na twardo");
    }
}
