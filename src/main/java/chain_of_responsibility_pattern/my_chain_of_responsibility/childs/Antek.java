package chain_of_responsibility_pattern.my_chain_of_responsibility.childs;

import chain_of_responsibility_pattern.my_chain_of_responsibility.MotherRequest;
import chain_of_responsibility_pattern.my_chain_of_responsibility.Shelf;

public class Antek extends Child{

    @Override
    public void proccesRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.HIGH)){
            System.out.println("Antek has taken off jar from the cupboard");
        } else {
            System.out.println("Antek is the highest child");
        }
    }
}
