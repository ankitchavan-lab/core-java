package corejava.filehandling.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

/*
 * 3) write a file copy program using byte streams.
( FileOutputStream and FileInputStream )
 */
public class Q3 {

	public static void main(String[] args) 
	{
		byte b[]=null;
		File f=new File("C:\\FileIO\\Assignment1\\fileWriter.txt");
		
		try(FileInputStream fis=new FileInputStream(f))
		{
			b=new byte[(int) f.length()];
			fis.read(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Assignment1\\FileCopy.txt",true))
		{
			//byte[] b2=new byte[(int) new File("C:\\FileIO\\Assignment1\\FileCopy.txt").length()];
			fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream(f))
		{
			b=new byte[(int) f.length()];
			fis.read(b);
			String ss=new String(b);
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
