package factory_pattern.my_fabric.car_brands;

import factory_pattern.my_fabric.FuelType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Car {

   protected int engineCapacity;
   protected FuelType fuelType;
   protected int yearOfProduction;
   protected String steeringWheel;
}
