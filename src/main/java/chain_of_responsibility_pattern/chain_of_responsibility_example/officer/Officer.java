package chain_of_responsibility_pattern.chain_of_responsibility_example.officer;

import chain_of_responsibility_pattern.chain_of_responsibility_example.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public abstract void proccesMessage(Message message);

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }
    public static void setHierarchy(Officer sergeant, Officer captain, Officer general) {
        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);
    }
}
