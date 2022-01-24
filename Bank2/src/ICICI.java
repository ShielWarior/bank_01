
public class ICICI extends Bank{
	
	ICICI()
	{
		System.out.println("Interest Rate is 7 %");
		System.out.println("Interest t0 be charged :");
		int interest = this.loan_amt/100*7;
		System.out.print(" "+interest+"\n");
	}
	
}
