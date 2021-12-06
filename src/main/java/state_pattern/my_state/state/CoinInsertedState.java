package state_pattern.my_state.state;

public class CoinInsertedState implements State{

    @Override
    public void insertCoin(SlotMachine slotMachine) {
        System.out.println("Moneta juz wlozona");
    }

    @Override
    public void pullTheLever(SlotMachine slotMachine) {
        System.out.println("Zaczynam gre");
        int a = slotMachine.newRandom();
        if (a < 5) {
            System.out.println("Brawo, wygrales, zabierz swoja wygrana i pociagnij dzwignie ponownie");
            slotMachine.setState(new WinState());
            slotMachine.setResult(slotMachine.getResult() + 1);
        } else {
            System.out.println("Niestety przegrales, zacznij gre od nowa");
            slotMachine.setResult(0);
            slotMachine.setState(new NoCoinState());
        }
    }
    @Override
    public void takeTheWinning(SlotMachine slotMachine) {
        System.out.println("Najpierw zagraj");
    }

    @Override
    public void writeOutCurrentGameResult(SlotMachine slotMachine) {
        System.out.println("Twoj wynik to: " + slotMachine.getResult());
    }
}
