package corejava.filehandling.assignment;

import java.io.*;
import java.util.Scanner;
/*
 * 1)accept 10 characters from a user ( use Scanner).
store these 10 characters in a file. (FileWriter)
Now open a file and read all these characters.
 */
public class Q1 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		char arr[]=new char [10];
     	System.out.println("Enter 10 characters");
		for(int j=0;j<10;j++)
		{
			arr[j]=sc.next().charAt(0);
		}
		File f=new File("C:\\FileIO\\Assignment1\\Q1.txt");
		try(FileWriter fw=new FileWriter(f))
		{
			fw.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(FileReader fr=new FileReader(f))
		{
			char arr1[] = new char[(int)f.length()];
			fr.read(arr1);
			String ss=new String(arr1);
			System.out.println(ss);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
