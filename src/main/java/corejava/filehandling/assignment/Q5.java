package corejava.filehandling.assignment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 5) accept as many as numbers from user till he presses "0"  and write these 
numbers in a file. Now Open a file and read these numbers. ( Hint :- use Scanner 
class for input, FileOutputStream, DataOutputStream, FileInputStream , DataInputStream)
 */
public class Q5 {

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		//int arr[]=new int[];
		File f=new File("c:\\FileIO\\Assignment1\\Scanner.txt");
		try(FileOutputStream fos=new FileOutputStream(f))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				while(true)
				{
					System.out.println("Enter Number");
					a=sc.nextInt();
					if(a==0)
						break;
					dos.writeInt(a);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream(f))
		{
			try(DataInputStream dis=new DataInputStream(fis))
			{
				while(dis.available()!=0)
				{
					System.out.print(dis.readInt());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
