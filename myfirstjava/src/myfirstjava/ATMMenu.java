package DailyTask;
import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int choice;
		        double balance = 1000.0; // initial balance
		        
		        do {
		            System.out.println("\n===== ATM Menu =====");
		            System.out.println("1: Check Balance");
		            System.out.println("2: Deposit");
		            System.out.println("3: Withdraw");
		            System.out.println("4: Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Your Balance: ₹" + balance);
		                    break;

		                case 2:
		                    System.out.print("Enter deposit amount: ₹");
		                    double deposit = sc.nextDouble();
		                    if (deposit > 0) {
		                        balance += deposit;
		                        System.out.println("₹" + deposit + " deposited successfully.");
		                    } else {
		                        System.out.println("Invalid deposit amount.");
		                    }
		                    break;

		                case 3:
		                    System.out.print("Enter withdraw amount: ₹");
		                    double withdraw = sc.nextDouble();
		                    if (withdraw > 0 && withdraw <= balance) {
		                        balance -= withdraw;
		                        System.out.println("₹" + withdraw + " withdrawn successfully.");
		                    } else {
		                        System.out.println("Invalid or Insufficient Balance.");
		                    }
		                    break;

		                case 4:
		                    System.out.println("Exiting... Thank you for using ATM!");
		                    break;

		                default:
		                    System.out.println("Invalid choice! Please try again.");
		            }
		        } while (choice != 4);

		        sc.close();
		    }
		


	

}
