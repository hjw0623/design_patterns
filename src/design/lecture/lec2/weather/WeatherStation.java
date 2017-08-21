package design.lecture.lec2.weather;

import design.lecture.lec2_2.display.CurrentConditionsDisplay;
import design.lecture.lec2_2.display.ForecastDisplay;
import design.lecture.lec2_2.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 30.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}
}
