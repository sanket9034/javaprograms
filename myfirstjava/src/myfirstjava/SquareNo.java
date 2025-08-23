package myfirstjava;
import java.util.Scanner;
public class SquareNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int m;
		do
		{
			m=a*a;
			System.out.println("Square of the number is"+" "+m);
			a--;
			
		}while(a>0);

	}

}
