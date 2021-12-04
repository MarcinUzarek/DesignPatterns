package factory_pattern.abstract_fabric.unit_types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public abstract class AirUnit extends Unit {

    protected int range;

    public AirUnit(int hp, int exp, int dmgDone, int range) {
        super(hp, exp, dmgDone);
        this.range = range;
    }
}
