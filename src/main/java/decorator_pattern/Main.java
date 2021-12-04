package decorator_pattern;

import decorator_pattern.decorators.ForrestDecorator;
import decorator_pattern.decorators.RoadDecorator;
import decorator_pattern.decorators.SwampDecorator;
import decorator_pattern.main_terrains.Hill;
import decorator_pattern.main_terrains.Plain;
import decorator_pattern.main_terrains.Terrain;

public class Main {

    public static void main(String[] args) {

        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());

        Terrain terrain3 = new ForrestDecorator(terrain2);

        System.out.println(terrain3.getFuelCost());

        Terrain terrain4 = new RoadDecorator((new Hill()));

        System.out.println(terrain4.getFuelCost() + terrain4.getDescription());



    }
}
