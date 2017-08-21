package design.lecture.lec5.chocolateFactory;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		this.empty= true;
		this.boiled=false;
	}
	//보일러가 비어있을때만 재료를 넣음. 
	//원료 가득 채우면 false로 플래그 변
	public void fill() {
		if(isEmpty()){
			this.empty = false;
			this.boiled = false;
		}
	}
	//보일러가 가득 차있고, 다 끓여진 상태에서만 다음단계로 넘어간다.
	//보일러 비우면 다시 플래그 true로 변경 
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	//보일러가 가득 차있고,아직 끓지 않은 상태에서만 초콜릿과 우유 혼합재료를 끓임
	//재료 다 끓으면 플래그를 true로 변경. 
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	
}
