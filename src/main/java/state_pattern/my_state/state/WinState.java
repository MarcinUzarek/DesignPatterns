package state_pattern.my_state.state;

public class WinState implements State{

    @Override
    public void insertCoin(SlotMachine slotMachine) {
        System.out.println("Moneta juz wlozona");
    }

    @Override
    public void pullTheLever(SlotMachine slotMachine) {
        System.out.println("Najpierw zabierz swoja wygrana");
    }

    @Override
    public void takeTheWinning(SlotMachine slotMachine) {
        System.out.println("Zabierz swoja wygrana");
        slotMachine.setState(new CoinInsertedState());
    }

    @Override
    public void writeOutCurrentGameResult(SlotMachine slotMachine) {
        System.out.println("Twoj wynik to: " + slotMachine.getResult());
    }
}
