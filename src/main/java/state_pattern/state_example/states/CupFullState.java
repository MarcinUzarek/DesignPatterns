package state_pattern.state_example.states;

import state_pattern.state_example.CoffeeMachine;

public class CupFullState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Najpierw zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Kawa juz zrobiona");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Zabrano kubek");
        coffeeMachine.setState(new NoCoinState());
    }
}
