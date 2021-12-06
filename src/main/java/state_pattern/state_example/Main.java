package state_pattern.state_example;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine= new CoffeeMachine();

        coffeeMachine.insertTheCoin();

        coffeeMachine.takeTheCup();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
    }
}
