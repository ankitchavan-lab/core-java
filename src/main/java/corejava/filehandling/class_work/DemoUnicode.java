package corejava.filehandling.class_work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoUnicode {

	

	public static void main(String[] args) 
	{
		char[] arr1 = null;
		try(FileWriter fw =new FileWriter("C:\\FileIO\\fileWriter.txt"))
		{
			char arr[]= {'A','N','K','I','T',' ','C','H','A','V','A','N'};
			fw.write(arr);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try(FileReader fr=new FileReader("C:\\FileIO\\fileWriter.txt"))
		{
			arr1 = new char[(int)new File("C:\\FileIO\\fileWriter.txt").length()];
			fr.read(arr1);
			String ss=new String(arr1);
			System.out.println(ss);
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("mxjwn");
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.println(arr1[i]);
//		}
	}

}
