package state_pattern.my_state.state;

public class NoCoinState implements State{

    @Override
    public void insertCoin(SlotMachine slotMachine) {
        System.out.println("Wlozono monete");
        slotMachine.setState(new CoinInsertedState());
    }

    @Override
    public void pullTheLever(SlotMachine slotMachine) {
        System.out.println("Najpierw włoż monete");
    }

    @Override
    public void takeTheWinning(SlotMachine slotMachine) {
        System.out.println("Najpierw włoż monete");
    }

    @Override
    public void writeOutCurrentGameResult(SlotMachine slotMachine) {
        System.out.println("Najpierw włoż monete");
    }
}
