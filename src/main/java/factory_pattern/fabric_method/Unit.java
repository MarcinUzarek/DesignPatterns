package factory_pattern.fabric_method;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Unit {

    private int hp;
    private int exp;
    private int dmg;
}
