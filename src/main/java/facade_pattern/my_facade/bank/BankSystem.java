package facade_pattern.my_facade.bank;

 class BankSystem {

    void transferMoney() {
        System.out.println("Przetransportowano pieniadze");
    }
    boolean validatePin() {
        System.out.println("Zostal wprowadzony poprawny Pin");
        return true;
    }
    boolean validateTransaction() {
        System.out.println("Transakcja zatwierdzona");
        return true;
    }
    void getTransactionHistory() {
        System.out.println("Historia transakcji:\nxxx\nyyy");
    }
}
