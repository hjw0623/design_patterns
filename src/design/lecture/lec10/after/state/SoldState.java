package design.lecture.lec10.after.state;

import design.lecture.lec10.before.state.GumballMachine;

public class SoldState implements State {
	transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	//상태에서 호출되기에 부적절한 메소드 
	@Override
	public void insertQuarter() {
		System.out.println("잠시만요, 알맹이가 나가고 있습니다. ");		
	}
	//상태에서 호출되기에 부적절한 메소드 
	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑았습니다. ");		

	}
	//상태에서 호출되기에 부적절한 메소드 
	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
