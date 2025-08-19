package myfirstjava;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening casting(Automatic casting) -- converting smaller type into larger type size
				//byte->short->char->int->long
				//narrowing casting(manual casting)-converting larger type size into smaller type size
				//double->float->long
				
		int myInt=9;
		double myDouble=myInt;
		System.out.println(myDouble);
		
		
		double myDouble1=9.908;
		int myInt1=(int) myDouble1;
		
		System.out.println(myInt1);
		


	}

}
