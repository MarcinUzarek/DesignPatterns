package facade_pattern.facade_example.deliverybox;

 class DeliveryBox {

    public boolean isDeliveryBoxFUll() {
        System.out.println("Delivery Box is not full");
        return false;
    }

    public boolean isDeliveryBoxBroken(){
        System.out.println("Delivery Box is not broken");
        return false;
    }
    public void getUserData() {
        System.out.println("User data Entered");
    }

    public void openBox() {
        System.out.println("Box opened");
    }

}
