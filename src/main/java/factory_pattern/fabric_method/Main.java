package factory_pattern.fabric_method;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();


        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        ArrayList<Unit> units = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String name = "tank" + i;
            units.add(factory.createUnit(UnitType.TANK));
            units.add(factory.createUnit(UnitType.RIFLEMAN));
            units.add(factory.createUnit(UnitType.RIFLEMAN));
        }

        System.out.println("Done");

        for (Unit unit : units) {
            System.out.println(unit);
        }
    }
}

