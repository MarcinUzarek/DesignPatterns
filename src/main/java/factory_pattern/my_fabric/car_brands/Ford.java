package factory_pattern.my_fabric.car_brands;

import factory_pattern.my_fabric.FuelType;

public abstract class Ford extends Car {

    protected String Model = "Ford";

    public Ford(int engineCapacity, FuelType fuelType, int yearOfProduction, String steringWhell) {
        super(engineCapacity, fuelType, yearOfProduction, steringWhell);

    }
}
