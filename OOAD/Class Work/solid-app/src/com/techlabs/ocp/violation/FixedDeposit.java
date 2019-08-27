package com.techlabs.ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int years;
	private FestivalCategory festival;
	
	public FixedDeposit(String name, double principal, int years, FestivalCategory festival) {
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getYears() {
		return years;
	}

	public FestivalCategory getFestival() {
		return festival;
	}
	
	public float calcRate() {
		if(festival == FestivalCategory.NEWYEAR)
			return 9;
		if(festival == FestivalCategory.HOLI)
			return 8;
		
		return 7;
	}
	
	public double calcSimpleInterset() {
		return ((principal * years * calcRate()) / 100);
		
	}
	

}
