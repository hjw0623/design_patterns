package design.lecture.lec3.decorator;

import design.lecture.lec3.component.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage; //Beverage에 대한 레퍼런스. 감싸는 component를 저장하기 위한 인스턴스.
	public Soy (Beverage beverage){	//component 설정을 위한 생성자. 
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", soy";
	}

	@Override
	public double cost() {
		return .17+beverage.cost();
	}
}
