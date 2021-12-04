package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.AirUnit;

public class CombatPlane extends AirUnit {

    public CombatPlane(int hp, int exp, int dmgDone, int range) {
        super(hp, exp, dmgDone, range);
    }

    @Override
    public String toString() {
        return "CombatPlane{" +
                "range=" + range +
                ", hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
