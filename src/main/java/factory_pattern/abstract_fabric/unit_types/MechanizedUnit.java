package factory_pattern.abstract_fabric.unit_types;

public abstract class MechanizedUnit extends Unit{

    protected String armor;

    public MechanizedUnit(int hp, int exp, int dmgDone, String armor) {
        super(hp, exp, dmgDone);
        this.armor = armor;
    }
}
