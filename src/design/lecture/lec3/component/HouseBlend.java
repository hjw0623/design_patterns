package design.lecture.lec3.component;

public class HouseBlend extends Beverage{
	public HouseBlend(){
		description = "house blend coffee";
	}
	@Override
	public double cost() {
		return 0.89;
	}
}
