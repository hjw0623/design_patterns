package design.lecture.lec1.duck;

import design.lecture.lec1.fly.FlyNoWay;
import design.lecture.lec1.quack.Quack;

public class ModelDuck	extends Duck {
	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	@Override
	public void display() {

		System.out.println("나는 모형 오리 ");
	}

}
