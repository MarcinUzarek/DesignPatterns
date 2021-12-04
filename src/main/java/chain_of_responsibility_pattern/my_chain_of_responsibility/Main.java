package chain_of_responsibility_pattern.my_chain_of_responsibility;

import chain_of_responsibility_pattern.my_chain_of_responsibility.childs.Ania;
import chain_of_responsibility_pattern.my_chain_of_responsibility.childs.Antek;
import chain_of_responsibility_pattern.my_chain_of_responsibility.childs.Child;
import chain_of_responsibility_pattern.my_chain_of_responsibility.childs.Tomek;

public class Main {
    public static void main(String[] args) {


        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerKid(ania);
        ania.setTallerKid(antek);
        tomek.proccesRequest(motherRequest);
    }

}
