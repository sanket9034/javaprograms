package DailyTask;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int i=1;
		int b;
		while(i<=10 && i>0) {
			b=a*i;
			i++;
			System.out.println(b);
			
		}
		

	}

}
