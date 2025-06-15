package inheritance;

public class DematAccount extends BankAccount {
		long id; //Demat account id
		double balance; //demat account balance
		double holdings; //current amount
		double portfolio; //long term holding
		float brokerage; //per-transaction charges
		public DematAccount() {}
		public DematAccount(String userName, String bankName, String ifsc, long accNo, int pin, String branch, long phno,long id, double balance, double holdings, double portfolio, float brokerage) {
			this.userName = userName;
			this.bankName = bankName;
			this.ifsc = ifsc;
			this.accNo = accNo;
			this.branch = branch;
			this.phno = phno;
			this.id = id;
			this.balance = balance;
			this.holdings = holdings;
			this.portfolio = portfolio;
			this.brokerage = brokerage;
		}
		public void displayDematAccount() {
			displayBankAccount();
			System.out.println(id);
			System.out.println(balance);
			System.out.println(holdings);
			System.out.println(portfolio);
			System.out.println(brokerage);
		}
	}