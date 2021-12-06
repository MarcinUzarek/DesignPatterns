package state_pattern.state_example;

import state_pattern.state_example.states.NoCoinState;
import state_pattern.state_example.states.State;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        state = new NoCoinState();
    }
    public void setState(State state) {
        this.state = state;
    }


    public void insertTheCoin() {
        state.insertTheCoin(this);
    }
    public void pushTheButton(){
        state.pushTheButton(this);
    }
    public void takeTheCup(){
       state.takeTheCup(this);
    }

}
