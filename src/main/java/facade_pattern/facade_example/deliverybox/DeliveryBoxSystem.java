package facade_pattern.facade_example.deliverybox;

 class DeliveryBoxSystem {

    public void sendNotification() {
        System.out.println("Text message sent to the client");
    }
    public boolean isPayementSecured() {
        System.out.println("Payment has beed secured");
        return true;
    }
    public boolean isUserDataValidated() {
        System.out.println("User data has been validated");
        return true;
    }
    public void scheduleDelivery(){
        System.out.println("Delivery has been scheduled");
    }

}
