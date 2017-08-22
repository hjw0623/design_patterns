package design.lecture.lec10.before.state;

import design.lecture.lec11.before.proxy.GumballMonitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count =0;
		if (args.length < 2){
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		count = Integer.parseInt(args[1]);
	
		GumballMachine gumballMachine  = new GumballMachine(args[0], count);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		monitor.report();
		
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		System.out.println(gumballMachine.stateDescription());
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		
//		System.out.println(gumballMachine.stateDescription());
//		
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.stateDescription());
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
		
	}

}