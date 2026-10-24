package corejava.filehandling.assignment;

import java.io.*;


/*
 * 4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )

 */
public class Q4 {

	public static void main(String[] args) 
	{
		char crr[]=null;
		
		File f=new File("C:\\FileIO\\Ankit.txt");
		try(FileReader fr=new FileReader(f))
		{
			crr=new char[(int) f.length()];
			fr.read(crr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f2=new File("C:\\FileIO\\Ankit1.txt");
		try(FileWriter fw=new FileWriter(f2))
		{
			fw.write(crr);
			String ss=new String(crr);
			System.out.println(ss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
