package design.lecture.lec10.after.state;

import design.lecture.lec10.before.state.GumballMachine;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	// 이 상태에서는 부적절한 메소드이긴함.
	// 상태에서 호출되기에 부적절한 메소드
	@Override
	public void insertQuarter() {
		System.out.println("잠시만요, 알맹이가 나가고 있습니다. ");
	}

	// 상태에서 호출되기에 부적절한 메소드
	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑았습니다. ");

	}

	// 상태에서 호출되기에 부적절한 메소드
	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요");
	}

	@Override
	public void dispense() {
		System.out.println("====축하합니다. 알맹이를 하나 더 받으실 수 있습니다.==== ");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else { 
			if(gumballMachine.getCount() > 0 ){ 
				gumballMachine.releaseBall();
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else{
				System.out.println("더 이상 알맹이가 없습니다. ");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
