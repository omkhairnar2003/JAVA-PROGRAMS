package inheritance.DerivedTypeCasting.UpCasting;

import inheritance.BankAccount;

public class SavingsAccount extends BankAccount{
	String type;
	double balance;
	double interest;		
	}
	SavingsAccount(String userName, String bankName, String ifsc, long accNo, int pin, String branch, long phno,
			String type, double balance, double interest) {
		this.userName = userName;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
	
		this.type = type;
		this.balance = balance;
		this.interest = interest;
	}
	public void displaySavingsAccount() {
		displayBankAccount();
		System.out.println(type);
		System.out.println(balance);
		System.out.println(interest);
	}

}
