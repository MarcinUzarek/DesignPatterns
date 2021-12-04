package chain_of_responsibility_pattern.chain_of_responsibility_example.officer;

import chain_of_responsibility_pattern.chain_of_responsibility_example.message.Message;

public class General extends Officer {

    private static final int CODE = 100;
    private static final String NAME = "Genral Uzarek";

    @Override
    public void proccesMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
           throw new IllegalArgumentException("Wrong message destiny");
        }
    }
}
