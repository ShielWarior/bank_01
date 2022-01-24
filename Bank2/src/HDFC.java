
public class HDFC extends Bank {

	HDFC()
	{
		System.out.println("Interest Rate is 8%");
		System.out.println("Interest t be charged :");
		int interest = this.loan_amt/100*8;
		System.out.print(" "+interest+"\n");
	}
}
