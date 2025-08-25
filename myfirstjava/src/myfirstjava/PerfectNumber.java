package DailyTask;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		for(int i=1;i<=a/2;i++) {
		  if(temp%i==0) {
			  sum=sum+i;
		  }
		}
		if(sum==temp) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println(" Not Perfect number");
		}
 
		

	}

}
