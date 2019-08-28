package com.techlabs.dip.violation;

public class TaxCalculator {
	private LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;
	}

	public int calculateTax(int amount, int rate) {
		int result = -1;
		try {
			result = amount/rate;
	}catch(Exception ex) {								//open-closed violation
		if(logType == LogType.XML) {
			XMLLogger logger = new XMLLogger();
			System.out.print("Writing to xml logger: ");
			logger.log(ex.getMessage());
		}
		if(logType == logType.DATABASE) {
			DBLogger logger = new DBLogger();
			System.out.println("Writing to database logger");
			logger.log(ex.getMessage());
		}
	}
		return result;
	}
}
