package factory_pattern.my_fabric.car_brands;

import factory_pattern.my_fabric.FuelType;

public abstract class Bmw extends Car {

    protected String Model = "Bmw";

    public Bmw(int engineCapacity, FuelType fuelType, int yearOfProduction, String steeringWheel) {
        super(engineCapacity, fuelType, yearOfProduction, steeringWheel);
    }
}
