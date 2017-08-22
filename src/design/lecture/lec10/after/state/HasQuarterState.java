package design.lecture.lec10.after.state;

import java.util.Random;

import design.lecture.lec10.before.state.GumballMachine;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis()); //랜덤 10%확률을 위한 난수 발생기 추가 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	//이 상태에서는 부적절한 메소드. 
	@Override
	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요 ");
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
		if((winner==0) && (gumballMachine.getCount() >1 )){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}
	//이 상태에서는 부적절한 메소드이긴함. 
	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다. ");
	}

}
