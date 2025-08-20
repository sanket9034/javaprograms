package myfirstjava;

class Conversion{
	double f;
	double k;
	public void fahren(double y){
		f=1.8*y+32;
		System.out.println("Fahrenheit temperature"+" "+f);
	}
	public void kelvin(double x) {
		k=273+x;
		System.out.println("kelvin temperature"+" "+k);
	}
}

public class Fahren {

	public static void main(String[] args) {
		Conversion obj=new Conversion();
		obj.fahren(2);
		obj.kelvin(89.9);
		
   
	}

}
