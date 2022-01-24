import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press \n1.Axis\n2.HDFC\n3.ICICI");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			Axis a1=new Axis();
			break;
		case 2:	
			HDFC h1=new HDFC();
			break;
		case 3:
			ICICI c1=new ICICI();
			break;
		default :
			System.out.println("Wrong Entry");
		}
		
		
		
		
		

	}

}
