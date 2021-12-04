package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.message.Message;
import chain_of_responsibility_pattern.officer.*;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Attack!", 100, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        Officer.setHierarchy(sergeant,captain,general);

        sergeant.proccesMessage(message);


    }
}
