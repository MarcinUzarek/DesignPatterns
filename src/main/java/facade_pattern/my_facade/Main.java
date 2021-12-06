package facade_pattern.my_facade;

import facade_pattern.my_facade.bank.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();

        atmMachineFacade.withdrawMoney();
    }
}
