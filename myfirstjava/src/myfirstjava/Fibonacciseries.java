package myfirstjava;
import java.util.Scanner;
public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1=0,a2=1,sum;
Scanner obj=new Scanner(System.in);
System.out.println("Enter no of terms you want to print");
int n=obj.nextInt();
System.out.print(a1+" "+a2);

for(int i=2;i<=n;i++) {
	sum=a1+a2;
	a1=a2;
	a2=sum;
	System.out.print(" "+sum);
}



	}

}
