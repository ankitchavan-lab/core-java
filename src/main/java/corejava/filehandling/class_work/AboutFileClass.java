package corejava.filehandling.class_work;
import java.io.*;
import java.util.*;
public class AboutFileClass 
{

	public static void main(String[] args) 
	{
		File f= new File("C:\\Users\\LENOVO\\Desktop\\FileIO\\Test1.java");
		System.out.println("File name\t"+f.getName());
		System.out.println("File path\t"+f.getPath());
		System.out.println("Can read\t"+f.canRead());
		System.out.println("Can Write\t"+f.canWrite());
		System.out.println("Absolute path"+f.getAbsolutePath());
		System.out.println("Is File Exists\t"+f.exists());
		System.out.println(f.isDirectory()?"It is Directory":"It is not Directory");
		System.out.println(f.isAbsolute()?"It is Absolute":"It is not Absolute");
		System.out.println(f.isFile()?"It is File":"It is not File");
		System.out.println(f.isHidden()?"It is Hidden File":"It is not Hidden File");
		System.out.println("File last modified\t"+new Date(f.lastModified()));
		System.out.println("File size is\t"+f.length());
		
		

	}

}
