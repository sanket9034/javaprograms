package programs;


public class ClaaUsingMethod {
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {
		return n1-n2;
	}
	public int mult(int n1,int n2) {
		return n1*n2;
	}
	public int div(int n1,int n2) {
		return n1/n2;
	}

	public static void main(String[] args) {
	  ClaaUsingMethod obj=new ClaaUsingMethod();
	int r1= obj.add(50,70);
	System.out.println("Addition is"+" "+r1);
	 int r2=obj.sub(500,80);
	 System.out.println("Subtraction is"+" "+r2);
	 int r3=obj.mult(45,80);
	 System.out.println("Multiplication is"+" "+r3);
	 int r4=obj.div(780,39);
	 System.out.println("Division is"+" "+r4);
	 

	}

}
