package com.swabhav.task;

public class Split {
	public static void main(String[] args) {

		String url = "http://www.aurionprosolution.com?programmer=Akash";
		String[] companyUrl = url.split("\\.");

		System.out.println("Company Name = " + companyUrl[1]);

		String[] developer = url.split("=");

		System.out.print("Developer Name = ");

		if (!(url.endsWith("="))) {
			System.out.println(developer[1]);
		}
	}
}