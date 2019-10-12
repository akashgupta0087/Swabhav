package com.techlabs.model;

import java.sql.Date;

public class TransactionLog {
	
	private String accName;
	private float amount;
	private String transactionType;
	private Date transactionDate;
	
	public TransactionLog(String accName, float amount, String transactionType, Date transactionDate) {
		this.accName = accName;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
	}

	public String getAccName() {
		return accName;
	}

	public float getAmount() {
		return amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

}
