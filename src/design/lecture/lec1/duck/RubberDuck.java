package design.lecture.lec1.duck;

import design.lecture.lec1.fly.FlyNoWay;
import design.lecture.lec1.quack.MuteQuack;

public class RubberDuck extends Duck {
	public RubberDuck(){
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	public void display(){
		System.out.println("저는 고무 오리입니다.");
	}
}
