package design.lecture.lec3.main;

import design.lecture.lec3.component.Beverage;
import design.lecture.lec3.component.DarkRoast;
import design.lecture.lec3.component.Espresso;
import design.lecture.lec3.component.HouseBlend;
import design.lecture.lec3.decorator.Mocha;
import design.lecture.lec3.decorator.Soy;
import design.lecture.lec3.decorator.Whip;

public class StarBuzzCoffee {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $" +beverage.cost());
		
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() +" $"+beverage3.cost());
		
		
		
		
	}

}
