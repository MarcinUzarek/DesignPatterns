package observer_pattern.order_observer_example.notification;

import observer_pattern.order_observer_example.order.Order;

public interface Observer {

    void update(Order order);
}
