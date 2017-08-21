package design.lecture.lec3.component;

public class Decaf extends Beverage {
	public Decaf() {
		description="decaf coffee";
	}
	@Override
	public double cost() {

		return 0.9;
	}
}
