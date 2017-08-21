package design.lecture.lec2.subject;

import java.util.ArrayList;

import design.lecture.lec2.observer.Observer;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		super();
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	//갱신된 측정치 받으면 옵저버에게 알리기 위한 호출 메소드 
	public void measurementsChanged(){
		notifyObservers();
	}
	//기상청웹에서 전달 받은 데이터로 값을 변경하고 measurementsChanged를 호출. 
	public void setMeasurements(float temp, float humid, float press){
		this.temperature = temp;
		this.humidity = humid;
		this.pressure = press;
		measurementsChanged();
	}

	//etc
	
}
