package myfirstjava;
import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first no");
		x=obj.nextInt();
		System.out.println("Enter second no");
		y=obj.nextInt();
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x!=y);
		
		// widening casting(Automatic casting) -- converting smaller type into larger type size
		//byte->short->char->int->long
		//narrowing casting(manual casting)-converting larger type size into smaller type size
		//double->float->long
		
		
		int myInt=9;
		double myDouble=myInt;
		System.out.println(myInt);
		
		
		double myDouble1=9.908;
		int myInt1=(int) myDouble1;
		
		System.out.println(myInt1);
		

	}

}
