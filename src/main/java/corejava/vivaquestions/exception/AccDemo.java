package corejava.vivaquestions.exception;

import java.util.Scanner;

public class AccDemo {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int bal;
		System.out.println("Enter balance ");
		bal=sc.nextInt();
		Account a1=new Account(bal);
		
		try {
			a1.withdraw(1000);
		} catch (InsufficiantBalanceException e) {
			
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
