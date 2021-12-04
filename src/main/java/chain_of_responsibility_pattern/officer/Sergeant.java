package chain_of_responsibility_pattern.officer;

import chain_of_responsibility_pattern.message.Message;

public class Sergeant extends Officer{

    private static final int CODE = 10;
    private static final String NAME = "Sergeant Kowalski";

    @Override
    public void proccesMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT)
            && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
            getSuperiorOfficer().proccesMessage(message);
        }
    }
}
