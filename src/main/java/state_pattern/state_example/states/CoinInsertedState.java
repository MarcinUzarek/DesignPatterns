package state_pattern.state_example.states;

import state_pattern.state_example.CoffeeMachine;

public class CoinInsertedState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta jest juz wrzucona");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Robie kawe");
        coffeeMachine.setState(new CupFullState());
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Najpierw wcisnij guzik");
    }
}
