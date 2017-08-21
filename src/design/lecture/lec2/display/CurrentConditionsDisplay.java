package design.lecture.lec2.display;

import design.lecture.lec2.observer.Observer;
import design.lecture.lec2.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions : " + temperature + "F degrees and , " + humidity + "% humidity");
	}

	
	@Override
	public void update(float temp, float humidity, float pressure) {

		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
