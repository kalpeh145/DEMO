import java.util.Scanner;

public class AccountDetails {
	public void getAccountDetails() {
		int id;
		String name;
		int Accountbalance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		id =sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter balance");
		Accountbalance =sc.nextInt();
		SavingAccount ipo=new SavingAccount();
		ipo.setId(id);
		ipo.setName(name);
		ipo.setAccountBalance(Accountbalance);;
			getbalance(ipo);
			sc.close();
		
	}
	private int getbalance(Account ipo) {
		int balance=0;
		System.out.println("Enter withdraw amount");
		Scanner sc=new Scanner (System.in);
		int withdraw=sc.nextInt();
		if (ipo.getAccountBalance()>withdraw) {
			balance=ipo.getAccountBalance()-withdraw;
			System.out.println("current Balance is "+balance);
		}
		return balance;
	}

}
