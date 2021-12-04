package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.MechanizedUnit;

public class Tank extends MechanizedUnit {

     Tank(int hp, int exp, int dmgDone, String armor) {
        super(hp, exp, dmgDone, armor);
    }

    @Override
    public String toString() {
        return "Tank{" +
                "armor='" + armor + '\'' +
                ", hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
