package observer_pattern.weather_observer_example.notifications;

import observer_pattern.weather_observer_example.weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("TV- " + forecast.getTemperature() +
                " Celcius Degrees, " + forecast.getPressure() + "hPa");
    }
}
