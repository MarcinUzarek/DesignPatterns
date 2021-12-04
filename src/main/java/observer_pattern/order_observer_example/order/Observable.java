package observer_pattern.order_observer_example.order;

import observer_pattern.order_observer_example.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
