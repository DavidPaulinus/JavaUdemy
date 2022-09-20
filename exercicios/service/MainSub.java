package exercicios.service;

public class MainSub {
	private String holder;
	private Integer number;
	private Double balance=0d;
	private Double withdrawLimit;

	public MainSub(String holder, Integer number, Double withdrawLimit) {
		super();
		this.holder = holder;
		this.number = number;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amaount) {
		this.balance += amaount;
	}

	public void withdraw(Double amaount) throws Exception {
		if (amaount > withdrawLimit) {
			throw new Exception("The amount exceeds withdraw limit");
		}
		if (amaount > balance) {
			throw new Exception("Not enough balance");
		}
		this.balance -= amaount;
	}

}
