package observer_pattern.order_observer_example.order;

import lombok.Getter;
import lombok.Setter;
import observer_pattern.order_observer_example.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Order implements Observable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.update(this);
        }
    }
}
