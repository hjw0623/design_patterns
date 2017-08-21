package design.lecture.lec2.weather;

import design.lecture.lec2.observer.Observer;
import design.lecture.lec2.subject.Subject;

public class BeforeWeatherData implements Subject{
	
	//instance variables declarization
	
	float temp;
	float humidity;
	float pressure;
	//기존에 구현된 getter
	public float getTemparature(){
		return temp;
	};
	public float getHumidity(){
		return humidity;
	};
	public float getPressure(){
		return pressure;
	};
	
	public void measurementsChanged(){
		float currentTemp = getTemparature();
		float currentHumidity = getHumidity();
		float currentPressure = getPressure();
		
		
//		//current update display
//		//확장 가능하지 않은 형태이다. 
//		currentConditionsDisplay.update(currentTemp, currentHumidity, currentPressure);
//		statisticsDisplay.update(currentTemp, currentHumidity, currentPressure);
//		forecastDisplay.update(currentTemp, currentHumidity, currentPressure);
		
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
