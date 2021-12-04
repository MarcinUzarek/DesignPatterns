package factory_pattern.fabric_method;

import lombok.ToString;

@ToString
public class Rifleman extends Unit{


     Rifleman(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }
}
