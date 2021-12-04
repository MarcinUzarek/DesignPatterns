package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.InfantryUnit;

public class Riffleman extends InfantryUnit {

     Riffleman(int hp, int exp, int dmgDone, String weapon) {
        super(hp, exp, dmgDone, weapon);
    }

    @Override
    public String toString() {
        return "Riffleman{" +
                "weapon='" + weapon + '\'' +
                ", hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
