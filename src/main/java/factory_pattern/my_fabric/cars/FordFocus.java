package factory_pattern.my_fabric.cars;

import factory_pattern.my_fabric.FuelType;
import factory_pattern.my_fabric.car_brands.Ford;
import lombok.Getter;

@Getter
public class FordFocus extends Ford {

     FordFocus(int engineCapacity, FuelType fuelType, int yearOfProduction, String steeringWheel) {
        super(engineCapacity, fuelType, yearOfProduction, steeringWheel);
    }

    @Override
    public String toString() {
        return "FordFocus{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType=" + fuelType +
                ", yearOfProduction=" + yearOfProduction +
                ", steeringWheel='" + steeringWheel + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
