package design.lecture.lec1.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println("can't sound anything.");
	}

}
