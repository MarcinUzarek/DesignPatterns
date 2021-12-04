package chain_of_responsibility_pattern.my_chain_of_responsibility;

import lombok.Getter;

@Getter
public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }
}
