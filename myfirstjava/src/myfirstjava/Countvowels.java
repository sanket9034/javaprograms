package DailyTask;
import java.util.Scanner;
public class Countvowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch =='A' ||ch== 'E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u') {
				count++;
			}
		}
		System.out.println("No of vowel is"+" "+count);
		

	}


}
