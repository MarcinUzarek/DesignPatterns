package command_pattern.command_example.workshop.command;

import command_pattern.command_example.workshop.CoffeeMaker;

public class CoffeeMakerTurnOn implements Command{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOn(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void unDo() {
        coffeeMaker.turnOff();
    }
}
