package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.AirUnit;
import factory_pattern.abstract_fabric.unit_types.InfantryUnit;
import factory_pattern.abstract_fabric.unit_types.MechanizedUnit;

public class BlueFactory extends Factory{
    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER -> {
                return new Helicopter(100, 0, 20, 1000);
            }
            case COMBATPLANE -> {
                return new CombatPlane(300,0,2,3000);
            }
            default -> throw new UnsupportedOperationException("There is no such air type");
        }
    }

    @Override
    public Riffleman createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN -> {
                return new Riffleman(20,0,5,"AK-47");
            }
            default -> throw new UnsupportedOperationException("There is no such infantry type");
        }
    }

    @Override
    public Tank createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK -> {
                return new Tank(100, 0, 20, "steel");
            }
            default -> throw new UnsupportedOperationException("There is no such mechanised type");
        }
    }
}
