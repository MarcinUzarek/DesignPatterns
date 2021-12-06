package state_pattern.state_example.states;

import state_pattern.state_example.CoffeeMachine;

public class NoCoinState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta zostala wrzucona");
        coffeeMachine.setState(new CoinInsertedState());
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Najpierw wrzuc monete");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Najpierw wrzuc monete");
    }
}
