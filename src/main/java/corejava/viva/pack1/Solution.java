package corejava.viva.pack1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer");
        int i = scan.nextInt();

        // Write your code here.
        System.out.println("Enter String");
        scan.nextLine();
        
        String s=scan.nextLine();
        System.out.println("Enter Double");
        double d=scan.nextDouble();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}