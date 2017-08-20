package design.lecture.lec1.duck;

import design.lecture.lec1.fly.FlyBehavior;
import design.lecture.lec1.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void perfomeQuack(){
		quackBehavior.quack();
	};
	public void performFly(){
		flyBehavior.fly();
	};
	public abstract void display();
	public void swim(){
		System.out.println("모든 오리는 물에 뜹니다. ");
	};
	public void setFlyBehavior (FlyBehavior fb){
		this.flyBehavior = fb;
	}
	public void setQuackBehavior (QuackBehavior qb){
		this.quackBehavior = qb;
	}
}
