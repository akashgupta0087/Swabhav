package com.swabhav.task;

public class Substring {
	public static void main(String[] args) {
		String url = "http://www.aurionprosolution.com?programmer=Akash";

		int startIndex = url.indexOf(".");
		int endIndex = url.lastIndexOf(".");
		int index = url.indexOf("=");

		String companyName = url.substring(startIndex + 1, endIndex);
		String developerName = url.substring(index + 1);

		System.out.println("Company Name = " + companyName);
		System.out.println("Developer Name = " + developerName);
	}
}