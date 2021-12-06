package state_pattern.my_state.state;

public interface State {

     void insertCoin(SlotMachine slotMachine);
     void pullTheLever(SlotMachine slotMachine);
     void takeTheWinning(SlotMachine slotMachine);
     void writeOutCurrentGameResult(SlotMachine slotMachine);
}
