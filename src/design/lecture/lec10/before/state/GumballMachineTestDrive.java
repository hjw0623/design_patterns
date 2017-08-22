package design.lecture.lec10.before.state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {

		GumballMachine gumballMachine  = new GumballMachine(5);
		
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine.stateDescription());
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		
		System.out.println(gumballMachine.stateDescription());
		
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.stateDescription());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
	}

}
