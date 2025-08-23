package myfirstjava;
import java.util.Scanner;
public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the obtained marks");
		int m=sc.nextInt();
		if(m>=90 && m<=100) {
			System.out.println("Grade is A");
		}
		else if(m>=80 && m<=89) {
			System.out.println("Grade is B");
		}
		else if(m>=70 && m<=79) {
			System.out.println("Grade is C");
		}
		else if(m>=60 && m<=69) {
			System.out.println("Grade is D");
		}
		else {
			System.out.println("Fail");
		}

	}

}
