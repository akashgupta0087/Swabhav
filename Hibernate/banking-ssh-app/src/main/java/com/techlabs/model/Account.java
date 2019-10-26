package com.techlabs.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Type(type="uuid-char")
	private UUID id;
	@Column(unique = true, nullable = false)
	private String accName;
	private String accPassword;
	private float balance;
	
	@OneToMany(mappedBy = "acc", cascade = CascadeType.ALL)
	private Set<TransactionLog> transactions = new HashSet<TransactionLog>();
	
	public String getAccName() {
		return accName;
	}

	public String getAccPassword() {
		return accPassword;
	}

	public float getBalance() {
		return balance;
	}

	public Set<TransactionLog> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<TransactionLog> transactions) {
		this.transactions = transactions;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
