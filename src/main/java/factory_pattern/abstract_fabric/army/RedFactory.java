package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.AirUnit;
import factory_pattern.abstract_fabric.unit_types.InfantryUnit;
import factory_pattern.abstract_fabric.unit_types.MechanizedUnit;

public class RedFactory extends Factory{
    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER -> {
                return new Helicopter(90, 0, 22, 900);
            }
            case COMBATPLANE -> {
                return new CombatPlane(400,0,2,2500);
            }
            default -> throw new UnsupportedOperationException("There is no such air type");
        }
    }

    @Override
    public Riffleman createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN -> {
                return new Riffleman(15,0,7,"M16");
            }
            default -> throw new UnsupportedOperationException("There is no such infantry type");
        }
    }

    @Override
    public Tank createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK -> {
                return new Tank(90, 0, 22, "red-steel");
            }
            default -> throw new UnsupportedOperationException("There is no such mechanised type");
        }
    }
}
