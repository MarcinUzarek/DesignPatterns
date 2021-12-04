package factory_pattern.abstract_fabric.unit_types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Unit {

    protected int hp;
    protected int exp;
    protected int dmgDone;

}