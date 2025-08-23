package DailyTask;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit consumed");
		float a=sc.nextFloat();
		float b;
		if(a<=100 && a>0) {
			b=a*3/2;
			System.out.println("Bill is"+" "+b);
		}
		else if(a<=200 && a>100) {
			b=(100*3/2)+((a-100)*5/2);
			System.out.println("Bill is"+" "+b);

		}
		else {
			b=(100*3/2)+100*5/2+(a-200)*4;
			System.out.println("Bill is"+" "+b);

		}

	}

}
