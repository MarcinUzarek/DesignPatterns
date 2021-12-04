package chain_of_responsibility_pattern.my_chain_of_responsibility.childs;

import chain_of_responsibility_pattern.my_chain_of_responsibility.MotherRequest;
import lombok.Getter;

@Getter
public abstract class Child {

    private Child tallerKid;

    public void setTallerKid(Child tallerKid) {
        this.tallerKid = tallerKid;
    }

    public abstract void proccesRequest(MotherRequest request);
}
