package myfirstjava;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte Byte
		//long Long
		//short Short
		//int Integer
		// ch Character
		
		
		byte b=10;
		short s=20;
		int i=45;
		long l=90;
		boolean b2=true;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Float floatobj=f;
		Double doubleobj=d;
		Boolean boolobj=b2;
		Character charobj=c;Update
		
		//autoboxing--converting primitive data type into objects
		//printing objects
		System.out.println(byteobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(boolobj);
		System.out.println(intobj);
		System.out.println(shortobj);
		
		//unboxing--converting objects to primitive data types
		
		
	byte b1=byteobj;
	short s1=shortobj;

	System.out.println(b1);
	System.out.println(s1);
	}

}
