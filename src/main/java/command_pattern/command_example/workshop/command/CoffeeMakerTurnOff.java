package command_pattern.command_example.workshop.command;

import command_pattern.command_example.workshop.CoffeeMaker;

public class CoffeeMakerTurnOff implements Command{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOff(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }

    @Override
    public void unDo() {
        coffeeMaker.turnOn();
    }
}
