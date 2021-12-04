package chain_of_responsibility_pattern.officer;

import chain_of_responsibility_pattern.message.Message;

public class Captain extends Officer{

    private static final int CODE = 50;
    private static final String NAME = "Captain Rokowski";

    @Override
    public void proccesMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
            getSuperiorOfficer().proccesMessage(message);
        }
    }
}
