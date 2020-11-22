package d08;

public class Account {
	public String accountHolder;
	public String accountNumber;
	public int balance;

	public Account() {

	}

	public Account(String accountHolder) {
		this.accountHolder = accountHolder;

	}

	public Account(int balance) {
		this.balance = balance;

	}

	public Account(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;

	}

	public Account(String accountHolder, int balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;

	}

	public Account(String accountHolder, String accountNumber, int balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public void withdrawMoney(int amount) {
		this.balance -= amount;
		System.out.println("잔액 : " + this.balance);

	}

	public void checkBalance() {
		System.out.println("잔액 : " + this.balance);

	}

	public void depositMoney(int amount) {
		this.balance += amount;
		System.out.println("잔액 : " + this.balance);

	}

	public String getAccountHolder() {
		return accountHolder;

	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;

	}

	public String getAccountNumber() {
		return accountNumber;

	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;

	}

	public int getBalance() {
		return balance;

	}

	public void setBalance(int balance) {
		this.balance = balance;

	}

	@Override
	public String toString() {
		return "Account [accountHolder = " + accountHolder + ", accountNumber = " + accountNumber + ", balance = " + balance
				+ "]";
	}

}
