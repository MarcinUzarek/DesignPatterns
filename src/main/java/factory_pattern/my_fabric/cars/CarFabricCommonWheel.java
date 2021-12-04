package factory_pattern.my_fabric.cars;

import factory_pattern.my_fabric.FuelType;
import factory_pattern.my_fabric.car_brands.Car;

public class CarFabricCommonWheel implements Fabric{

    String steeringWheel = "right";

    @Override
    public Car createCar(CarType type) {
        switch (type) {
            case BMWE60 -> {
                return new BmwE60(2, FuelType.GASOLINE,2000, steeringWheel);
            }
            case BMWX5 -> {
                return new BmwX5(1,FuelType.BIODIESEL,2010, steeringWheel);
            }
            case FORDCMAX -> {
                return new FordCMax(3,FuelType.ELECTRICITY, 2019, steeringWheel);
            }
            case FORDFOCUS -> {
                return new FordFocus(4,FuelType.PETROLEUM, 1990, steeringWheel);
            }
            default -> {
                throw new UnsupportedOperationException("There is no such car in our fabric");
            }
        }
    }
}
