package factory_pattern.fabric_method;


public class Tank extends Unit {

     Tank(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }

    @Override
    public String toString() {
        return "hp: " + getHp() + " dmg: " + getDmg();
    }
}
