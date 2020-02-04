package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = 0.00;
	}

	public void deposit(double amount) {
		this.balance = +amount;
	}

	public void withdraw(double amount) {
		this.balance = +amount + 5.00;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + balance;
	}

}
