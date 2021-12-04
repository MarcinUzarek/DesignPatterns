package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.AirUnit;
import lombok.ToString;


public class Helicopter extends AirUnit {

     Helicopter(int hp, int exp, int dmgDone, int range) {
        super(hp, exp, dmgDone, range);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "range=" + range +
                ", hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
