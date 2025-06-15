package inheritance;

public class LoanAccount extends BankAccount {
	long id; //loan id
	String type; //home, car, education
	double amount; //loan amount
	float roi; //interest on loan
	int tenure; //repayment period in months
	
	public LoanAccount() {}
	public LoanAccount(String userName, String bankName, String ifsc, long accNo,int pin, String branch, long phno, long id, String type, double amount, float roi, int tenure) {
		this.userName = userName;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.accNo = accNo;
		this.branch = branch;
		this.phno = phno;
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.roi = roi;
		this.tenure = tenure;
	}
	public void displayLoanAccount() {
		displayBankAccount();
		System.out.println(id);
		System.out.println(type);
		System.out.println(amount);
		System.out.println(roi);
		System.out.println(tenure);
	}


}
