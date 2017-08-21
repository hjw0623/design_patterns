package design.lecture.lec2_2.display;

import java.util.Observable;
import java.util.Observer;

import design.lecture.lec2.display.DisplayElement;
import design.lecture.lec2_2.subject.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {
	private float currentPressure =29.92f;
	private float lastPressure  ;
	Observable observable;

	public ForecastDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this); //observable구현객체에 ForecastDisplay를 옵저버로 등록 
	}
	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData){
			WeatherData weatherData = (WeatherData) observable;
			this.lastPressure = currentPressure;
			this.currentPressure = weatherData.getPressure();
			
			display();
		}
	}

	@Override
	public void display() {

		System.out.println("Forecast : " + currentPressure + "  currentPressure and , " + lastPressure + "  lastPressure");

	}

}
