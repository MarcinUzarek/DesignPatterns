package facade_pattern.facade_example;

import facade_pattern.facade_example.deliverybox.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();

        deliveryBoxFacade.pickupPackage();


    }


}
