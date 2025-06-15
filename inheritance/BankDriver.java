package inheritance;

public class BankDriver {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount("OM", "Union", "UBIN00000", 9876543210l, 1234, "LBS Marg", 8976543210l, "Saving", 50000.00, 5);
		//s1.displayBankAccount();
		s1.displaySavingsAccount();
		System.out.println("----New Constructor----");		
		LoanAccount l1 = new LoanAccount("OM","Union","UBIN00000",9876543210l,1234,"LBS Marg",8976543210l,199l,"Car Loan",1200000.0,8.5f,84);
		l1.displayLoanAccount();
		System.out.println("----New Constructor----");
		DematAccount d1 = new DematAccount("om","Union","UBIN00000",9876543210l,1234,"LBS Marg",8976543210l, 9999999999l, 50000.0, 1200000.0, 100000.0, 10.0f);
		d1.displayDematAccount();
	}
	
}