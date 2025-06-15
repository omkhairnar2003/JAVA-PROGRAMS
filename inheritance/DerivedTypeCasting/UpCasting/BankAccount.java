package inheritance.DerivedTypeCasting.UpCasting;

public class BankAccount {
		String userName;
		String bankName;
		String ifsc;
		long accNo;
		int pin;
		String branch;
		long phno;
		BankAccount(){
			
		}
		public BankAccount(String userName, String bankName, String ifsc, long accNo, int pin, String branch, long phno) {
			this.userName = userName;
			this.bankName = bankName;
			this.ifsc = ifsc;
			this.accNo = accNo;
			this.pin = pin;
			this.branch = branch;
			this.phno = phno;
		}
		public void displayBankAccount() {
			System.out.println(userName);
			System.out.println(bankName);
			System.out.println(branch);
			System.out.println(accNo);
			System.out.println(pin);
			System.out.println(phno);
			System.out.println(ifsc);
			System.out.println("------------------------------------");
		}
	}

