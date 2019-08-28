package com.techlabs.dip.solution;

import com.techlabs.dip.solution.DBLogger;
import com.techlabs.dip.solution.XMLLogger;

public class TaxCalulator {
	private ILoggable logger;

	public TaxCalulator(ILoggable logger) {
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		int result = -1;
		try {
			result = amount / rate;
		} catch (Exception ex) {
			logger.log(ex.getMessage());
			throw ex;
		}
		return result;
	}

}
