package com.swabhav.task3.test;

import com.swabhav.task.*;

public class BankTest {
	public static void main(String args[]){  
		//Bank b;  
		//b=new SBI();  
		SBI s = new SBI();
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
		
		//b=new ICICI();  
		ICICI i = new ICICI();
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		
		//b=new AXIS();  
		AXIS a = new AXIS();
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		
		
	}
}
