package observer_pattern.weather_observer_example.notifications;

import observer_pattern.weather_observer_example.weather.WeatherForecast;

public interface Observer {
    void update(WeatherForecast forecast);
}
