package programs;

public class DivisibleBy12 {
	public void div(int n1) {
		if(n1%3==0 && n1%4==0) {
			System.out.println("No is divisible by 12");
		}
		else {
			System.out.println("Not divisible by 12");
		}

	}

	public static void main(String[] args) {
	DivisibleBy12 obj=new DivisibleBy12 ();
	obj.div(78);
	
	}

}
