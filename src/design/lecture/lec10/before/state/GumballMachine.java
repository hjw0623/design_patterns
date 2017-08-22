	package design.lecture.lec10.before.state;

import design.lecture.lec10.after.state.HasQuarterState;
import design.lecture.lec10.after.state.NoQuarterState;
import design.lecture.lec10.after.state.SoldOutState;
import design.lecture.lec10.after.state.SoldState;
import design.lecture.lec10.after.state.State;
import design.lecture.lec10.after.state.WinnerState;

//껌볼 머신 : 동전 한개 넣을 때 구체껌이 굴러나오는 뽑기머신 
	public class GumballMachine {
		//state instance variable
		State soldOutState;
		State noQuarterState;
		State hasQuarterState;
		State soldState;
		State winnerState; 				//공짜 알맹이 당첨 기능 추가 
		State state = soldOutState; 	// 현재 상태를 관리하기 위한 State 객체 
		int count = 0; 					//기계에 들어있는 알맹이의 개수를 저장하기 위한 인스턴스 변수 
		
	
		
		public GumballMachine(int numberGumballs) {
			soldOutState = new SoldOutState(this);
			noQuarterState = new NoQuarterState(this);
			hasQuarterState = new HasQuarterState(this);
			soldState = new SoldState(this);
			winnerState = new WinnerState(this);
			this.count = numberGumballs;
			if(numberGumballs > 0){
				state = noQuarterState;
			}
		}
		
		public void insertQuarter(){
			state.insertQuarter();
		}
		public void ejectQuarter(){
			state.ejectQuarter();
		}
		public void turnCrank(){
			state.turnCrank();
			state.dispense();
		}
		public void releaseBall(){
			System.out.println("A gumball comes rolling out the slot" );
			if(count!=0){
				count = count-1;
			}
		}
		public State getWinnerState() {
			return winnerState;
		}

		//다른 객체에서 뽑기기계의 상태를 다른 상태로 전환. 
		public void setState(State state){
			this.state = state;
		}
		public String stateDescription() {
			String desc = "주식회사 왕뽑기 \n"+"자바로 돌아가는 2017년형 뽑기 기계 \n"+"남은 개수 :"+this.count+"개 \n";
			if(this.count >0){
				desc += "동전 투입 대기중 \n";
			}else{
				desc += "매진 \n ";
			}
			return desc;
		}

		public State getSoldOutState() {
			return soldOutState;
		}

		public State getNoQuarterState() {
			return noQuarterState;
		}

		public State getHasQuarterState() {
			return hasQuarterState;
		}

		public State getSoldState() {
			return soldState;
		}

		public int getCount() {
			return count;
		}

		public State getState() {
			return state;
		}
	}
