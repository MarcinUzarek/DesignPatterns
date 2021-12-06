package state_pattern.my_state.state;

import state_pattern.my_state.state.NoCoinState;
import state_pattern.my_state.state.State;

import java.util.Random;

public class SlotMachine {

    private State state;
    private int result = 0;

    public SlotMachine() {
        this.state = new NoCoinState();
    }

    void setState(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    int getResult() {
        return result;
    }

    void setResult(int result) {
        this.result = result;
    }

    public void insertCoin(){
        state.insertCoin(this);
    }
    public void pullTheLever(){
        state.pullTheLever(this);
    }
    public void takeTheWinning() {
        state.takeTheWinning(this);
    }
    public void writeOutCurrentGameResult() {
        state.writeOutCurrentGameResult(this);
    }
    int newRandom() {
        Random random = new Random();
        return random.nextInt(0,10);
    }

}
