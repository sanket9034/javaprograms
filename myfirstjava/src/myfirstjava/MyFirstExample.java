package myfirstjava;
import java.util.Scanner;

	
public class MyFirstExample {

	public static void main(String[] args) {
  float x,y,sum,sub,mult,div,mod;
   Scanner obj=new Scanner(System.in);
  System.out.println("Enter first number");
   x=obj.nextFloat();
   System.out.println("Enter second number");
   y=obj.nextFloat();
   sum=x+y;
   sub=x-y;
   mult=x*y;
   div=x/y;
   mod=x%y;
  System.out.println("sum is"+" "+sum);
  System.out.println("subtraction is"+" "+sub);
  System.out.println("multiplication is"+" "+mult);
  System.out.println("division is"+" "+div);
  System.out.println("modulus is"+" "+mod); 
   String str1,str2,str3;
   System.out.println("Enter first string");
   str1=obj.nextLine();
   System.out.println("Enter second string");
   str2=obj.nextLine();
   str3=str1+str2;
   System.out.println("final string"+" "+str3);
   
  
	}

}
