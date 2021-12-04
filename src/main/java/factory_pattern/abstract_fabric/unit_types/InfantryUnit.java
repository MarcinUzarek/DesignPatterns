package factory_pattern.abstract_fabric.unit_types;

public abstract class InfantryUnit extends Unit{

    protected String weapon;

    public InfantryUnit(int hp, int exp, int dmgDone, String weapon) {
        super(hp, exp, dmgDone);
        this.weapon = weapon;
    }
}
