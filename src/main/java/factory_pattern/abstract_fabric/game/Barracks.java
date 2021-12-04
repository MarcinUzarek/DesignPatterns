package factory_pattern.abstract_fabric.game;

import factory_pattern.abstract_fabric.army.BlueFactory;
import factory_pattern.abstract_fabric.army.Factory;
import factory_pattern.abstract_fabric.army.RedFactory;
import factory_pattern.abstract_fabric.army.UnitType;
import factory_pattern.abstract_fabric.unit_types.Unit;

import java.util.ArrayList;

public class Barracks {
    private static final Factory redFactory = new RedFactory();
    private static final Factory blueFactory = new BlueFactory();

        public static ArrayList<Unit> createRedArmy(int planes, int helis, int riflemans, int tanks) {
        ArrayList<Unit> army = new ArrayList<>();
        for (int i = 0; i < planes; i++) {
            army.add(redFactory.createAirUnit(UnitType.COMBATPLANE));
        }
        for (int i = 0; i < helis; i++) {
            army.add(redFactory.createAirUnit(UnitType.HELICOPTER));
        }
        for (int i = 0; i < riflemans; i++) {
            army.add(redFactory.createInfantryUnit(UnitType.RIFLEMAN));
        }
        for (int i = 0; i < tanks; i++) {
            army.add(redFactory.createMechanizedUnit(UnitType.TANK));
        }
        return army;
    }
    public static ArrayList<Unit> createBlueArmy(int planes, int helis, int riflemans, int tanks) {
        ArrayList<Unit> army = new ArrayList<>();
        for (int i = 0; i < planes; i++) {
            army.add(blueFactory.createAirUnit(UnitType.COMBATPLANE));
        }
        for (int i = 0; i < helis; i++) {
            army.add(blueFactory.createAirUnit(UnitType.HELICOPTER));
        }
        for (int i = 0; i < riflemans; i++) {
            army.add(blueFactory.createInfantryUnit(UnitType.RIFLEMAN));
        }
        for (int i = 0; i < tanks; i++) {
            army.add(blueFactory.createMechanizedUnit(UnitType.TANK));
        }
        return army;
    }
}
