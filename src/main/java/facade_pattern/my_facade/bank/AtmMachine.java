package facade_pattern.my_facade.bank;

 class AtmMachine {

     void checkBalance() {
         System.out.println("Masz na koncie 1000");
     }
     void enterPin(){
         System.out.println("Wprowadzono poprawny pin");
     }
     public void withdrawCash() {
         System.out.println("Wyplacono gotowke");
     }
}
