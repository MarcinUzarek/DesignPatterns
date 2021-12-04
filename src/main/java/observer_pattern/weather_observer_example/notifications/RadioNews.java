package observer_pattern.weather_observer_example.notifications;

import observer_pattern.weather_observer_example.weather.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("Radio- " + forecast.getTemperature() +
                " Celcius Degrees, " + forecast.getPressure() + "hPa");
    }
}
