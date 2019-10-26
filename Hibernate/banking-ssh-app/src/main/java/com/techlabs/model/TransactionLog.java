package com.techlabs.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class TransactionLog {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Type(type="uuid-char")
	private UUID id;
	
	@ManyToOne
	@JoinColumn
	private Account acc;
	private float amount;
	private String transactionType;
	private Date transactionDate;
	
	public TransactionLog(String accName, float amount, String transactionType, Date transactionDate) {
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
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
