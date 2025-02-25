package com.xworkz.streamtask.dto;

import java.util.Objects;

public class TransactionDto {
	private int id;
	private double amount;
	private String type;
	
	public TransactionDto(int id, double amount, String type) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionDto other = (TransactionDto) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && id == other.id
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "TransactionDto [id=" + id + ", amount=" + amount + ", type=" + type + "]";
	}	
	
}
