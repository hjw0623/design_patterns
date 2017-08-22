package design.lecture.lec10.after.state;

import design.lecture.lec10.before.state.GumballMachine;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
