import java.util.Scanner;

public class Bank {
	double Acc_no;
	String name;
	int loan_amt;
	Bank()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Acc_no :");
		this.Acc_no=sc.nextDouble();
		System.out.println("Enter your Name :");
		this.name=sc.next();
		System.out.println("Enter Loan Amount :");
		this.loan_amt=sc.nextInt();
	}
}
