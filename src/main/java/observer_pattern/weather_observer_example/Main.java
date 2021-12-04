package observer_pattern.weather_observer_example;

import observer_pattern.weather_observer_example.notifications.InternetNews;
import observer_pattern.weather_observer_example.notifications.RadioNews;
import observer_pattern.weather_observer_example.notifications.TvNews;
import observer_pattern.weather_observer_example.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.changeWeather(18, 1007);
    }
}
