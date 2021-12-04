package factory_pattern.abstract_fabric.game;

import factory_pattern.abstract_fabric.army.*;
import factory_pattern.abstract_fabric.unit_types.AirUnit;
import factory_pattern.abstract_fabric.unit_types.Unit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var redArmy = Barracks.createRedArmy(1, 2, 8, 3);

        System.out.println("RED ARMY: ");
        for (Unit unit : redArmy) {
            System.out.println(unit);
        }
        System.out.println("------------------------------------");
        System.out.println("BLUE ARMY:");
        var blueArmy = Barracks.createRedArmy(2, 1, 5, 4);
        for (Unit unit : blueArmy) {
            System.out.println(unit);
        }


    }
}
