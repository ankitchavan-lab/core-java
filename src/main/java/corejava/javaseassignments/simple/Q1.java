package corejava.javaseassignments.simple;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number ");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("table for:  "+a);
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
		System.out.println("table for:  "+b);
		for(int i=1;i<=10;i++)
		{
			System.out.println(b*i);
		}
			
				

	}

}
