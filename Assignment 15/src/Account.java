
public class Account {
	private int id;
	private String name;
	private int accountBalance;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

}
class SavingAccount extends Account{
	int withdrawAmount;

	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
}