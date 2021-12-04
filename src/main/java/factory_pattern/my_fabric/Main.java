package factory_pattern.my_fabric;

import factory_pattern.my_fabric.cars.CarFabricCommonWheel;
import factory_pattern.my_fabric.cars.CarFabricLeftWheel;
import factory_pattern.my_fabric.cars.CarType;
import factory_pattern.my_fabric.cars.Fabric;

public class Main {

    public static void main(String[] args) {

        Fabric fabric = new CarFabricLeftWheel();
        Fabric fabric2 = new CarFabricCommonWheel();

        var car1 = fabric.createCar(CarType.BMWE60);
        var car2 = fabric2.createCar(CarType.BMWX5);
        var car3 = fabric.createCar(CarType.FORDFOCUS);
        var car4 = fabric.createCar(CarType.FORDCMAX);

        System.out.println(car1.getSteeringWheel());
        System.out.println(car2.getSteeringWheel());
    }
}
