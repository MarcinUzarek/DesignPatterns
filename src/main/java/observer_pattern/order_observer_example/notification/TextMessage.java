package observer_pattern.order_observer_example.notification;

import observer_pattern.order_observer_example.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS - Order number: " + order.getOrderNumber() +
                ", ObserverPattern.OrderObserver.order status changed to: " + order.getOrderStatus());
    }
}
