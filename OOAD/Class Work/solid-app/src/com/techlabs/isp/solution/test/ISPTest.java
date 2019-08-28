package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.*;
import com.techlabs.isp.solution.Manager;
import com.techlabs.isp.solution.Robot;

public class ISPTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atWorkstation(manager);
		atCafeteria(manager);

		atWorkstation(robot);

	}

	public static void atWorkstation(IWorkable work) {
		System.out.println("At workstation");
		work.startWork();
		work.stopWork();
	}

	public static void atCafeteria(IEatable eat) {
		System.out.println("At cafeteria");
		eat.startEat();
		eat.stopEat();
	}

}
