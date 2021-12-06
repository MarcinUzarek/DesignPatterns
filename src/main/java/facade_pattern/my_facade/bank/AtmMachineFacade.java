package facade_pattern.my_facade.bank;

public class AtmMachineFacade {

    private AtmMachine machine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        this.bankSystem = new BankSystem();
        this.machine = new AtmMachine();
    }

    public void withdrawMoney(){
        machine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()){
            machine.withdrawCash();
        }
    }
}
