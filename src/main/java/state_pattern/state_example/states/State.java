package state_pattern.state_example.states;

import state_pattern.state_example.CoffeeMachine;

public interface State {
    void insertTheCoin(CoffeeMachine coffeeMachine);
    void pushTheButton(CoffeeMachine coffeeMachine);
    void takeTheCup(CoffeeMachine coffeeMachine);

}
