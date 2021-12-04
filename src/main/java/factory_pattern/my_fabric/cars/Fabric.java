package factory_pattern.my_fabric.cars;

import factory_pattern.my_fabric.car_brands.Bmw;
import factory_pattern.my_fabric.car_brands.Car;

public interface Fabric {

     Car createCar(CarType type);
}
