package myfirstjava;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=obj.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0)
			count++;
	}
	if(count==2) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("not prime number");
	}
	

	}

}
