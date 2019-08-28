package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class ISPTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		atWorkstation(manager);
		atCafeteria(manager);
		
		atWorkstation(robot); 	//LSP violation
		atCafeteria(robot);    //Solution ISp
		
	}
	
	public static void atWorkstation(IWorker work) {
		System.out.println("At workstation");
		work.startWork();
		work.stopWork();
	}
	
	public static void atCafeteria(IWorker eat) {
		System.out.println("At cafeteria");
		eat.startEat();
		eat.stopEat();
	}

}
