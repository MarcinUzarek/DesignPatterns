package observer_pattern.weather_observer_example.weather;

import observer_pattern.weather_observer_example.notifications.Observer;

public interface Observable {
     void registerObserver(Observer observer);
     void unregisterObserver(Observer observer);
     void notifyObservers();
}
