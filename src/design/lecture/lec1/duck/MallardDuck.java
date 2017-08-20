package design.lecture.lec1.duck;

import design.lecture.lec1.fly.FlywithWings;
import design.lecture.lec1.quack.Quack;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
	}
	public void display(){
		System.out.println("저는 물오리입니다.");
	}
}
