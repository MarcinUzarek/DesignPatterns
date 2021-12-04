package factory_pattern.abstract_fabric.army;

import factory_pattern.abstract_fabric.unit_types.AirUnit;
import factory_pattern.abstract_fabric.unit_types.InfantryUnit;
import factory_pattern.abstract_fabric.unit_types.MechanizedUnit;

public abstract class Factory {

    public abstract AirUnit createAirUnit(UnitType type);
    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);
}
