package com.demo.Bean;

public abstract class AccountInfo {
	private int Id;
	private String Name;
	private double Balance;
	public AccountInfo() {
		super();
	}
	public AccountInfo(int id, String name, double balance) {
		super();
		Id = id;
		Name = name;
		Balance = balance;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public abstract double CalculateInterest() ; 

	@Override
	public String toString() {
		return "AccountInfo [Id=" + Id + ", Name=" + Name + ", Balance=" + Balance + "]";
	}

	

}
