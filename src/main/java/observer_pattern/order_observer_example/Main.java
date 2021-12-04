package observer_pattern.order_observer_example;

import observer_pattern.order_observer_example.notification.Email;
import observer_pattern.order_observer_example.notification.MobileApp;
import observer_pattern.order_observer_example.notification.TextMessage;
import observer_pattern.order_observer_example.order.Order;

import static observer_pattern.order_observer_example.order.OrderStatus.*;
import static observer_pattern.order_observer_example.order.OrderStatus.SENT;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(110L, REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order1.registerObserver(textMessage);
        order1.registerObserver(mobileApp);
        order1.registerObserver(email);

        order1.notifyObservers();
        System.out.println();

        order1.changeOrderStatus(SENT);

        order1.unregisterObserver(textMessage);

        System.out.println();
        order1.changeOrderStatus(RECEIVED);

    }




}
