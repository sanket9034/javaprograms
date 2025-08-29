package programs;
import java.util.Scanner;




public class Palindrome {
	String rev="";
	public void palin(String s) {
		String temp=s;
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(temp.equals(rev)) {
		System.out.println("Palindrome ");
	}
	else {
		System.out.println(" not Palindrome ");
		
	}
	}


	public static void main(String[] args) {
		
	Palindrome obj=new Palindrome();
	obj.palin("mada");
		
	}

	
	}


