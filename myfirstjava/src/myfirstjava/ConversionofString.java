package myfirstjava;
import java.util.Scanner;
public class ConversionofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter a string");
  String str=obj.nextLine();
  //convert to int
  int intvalue=Integer.parseInt(str);
  //convert to long
  long longvalue=Long.parseLong(str);
  //convert to float
  float floatvalue=Float.parseFloat(str);
  //convert to double
  double doublevalue=Double.parseDouble(str);
  
  System.out.println("Interger conversion"+" "+intvalue);
  System.out.println("long conversion"+" "+longvalue);
  System.out.println("float conversion"+" "+floatvalue);
  System.out.println("double conversion"+" "+doublevalue);
  
  
	}

}
