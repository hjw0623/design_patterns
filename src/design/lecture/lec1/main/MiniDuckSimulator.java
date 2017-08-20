package design.lecture.lec1.main;

import design.lecture.lec1.duck.Duck;
import design.lecture.lec1.duck.MallardDuck;
import design.lecture.lec1.duck.ModelDuck;
import design.lecture.lec1.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallardDuck = new MallardDuck();
		mallardDuck.perfomeQuack();
		mallardDuck.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
