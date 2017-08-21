package design.lecture.lec5.chocolateFactory;

public class SingletonChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static SingletonChocolateBoiler uniqueInstance  ;
//		private volatile static SingletonChocolateBoiler uniqueInstance  ;
//		private SingletonChocolateBoiler(){}
//		public static synchronized SingletonChocolateBoiler getInstance(){
//			if(uniqueInstance==null){
//				synchronized(SingletonChocolateBoiler.class){
//					if(uniqueInstance ==null) {
//						uniqueInstance = new SingletonChocolateBoiler();
//					}
//				}
//			}
//			return uniqueInstance;
//		}
	private SingletonChocolateBoiler(){
		this.empty = true;
		this.boiled = false;
	}

	public static synchronized SingletonChocolateBoiler getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new SingletonChocolateBoiler();
		}
		return uniqueInstance;
	}
	//이하 동
	public void fill() {
		if(isEmpty()){
			this.empty = false;
			this.boiled = false;
		}
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
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

		
	
