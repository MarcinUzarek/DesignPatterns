package chain_of_responsibility_pattern.my_chain_of_responsibility.childs;

import chain_of_responsibility_pattern.my_chain_of_responsibility.MotherRequest;
import chain_of_responsibility_pattern.my_chain_of_responsibility.Shelf;

public class Ania extends Child{

    @Override
    public void proccesRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Ania has taken off jar from the cupboard");
        } else {
            this.getTallerKid().proccesRequest(request);
        }
    }
}
