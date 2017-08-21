package design.lecture.lec2_2.subject;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{ //등록/탈퇴 등은 Observable 클래스에서 다 처리한다.
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){ } //생성자에서 옵저버 저장위한 자료구조를 만들 필요가 없다.
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(float temp, float humid, float press){
		this.temperature = temp;
		this.humidity = humid;
		this.pressure = press;
		measurementsChanged();
		
	}
	//pull 방식이므로 존재. 옵저버가 WeatherData객체의 상태를 알아낼때 이 메소드를 사용.
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
