package facade_pattern.facade_example.deliverybox;

public class DeliveryBoxFacade {

    private final DeliveryBox deliveryBox;
    private final DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {
        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPayementSecured()) {
            deliveryBox.openBox();
        };
    }
}
