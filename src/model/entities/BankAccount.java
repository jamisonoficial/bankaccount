package model.entities;

public class BankAccount {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public BankAccount(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrowLimit() {
		return withdrawLimit;
	}

	public void setWithdrowLimit(Double withdrowLimit) {
		this.withdrawLimit = withdrowLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		
		balance -= amount;
	}
}
