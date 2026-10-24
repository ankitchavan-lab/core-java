package corejava.filehandling.class_work;

import java.io.*;

public class Demo2 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\LENOVO\\Desktop\\FileIO\\New2.txt");

		try (FileOutputStream fos = new FileOutputStream(f, true);) // true is append mode
		{
			byte b[] = new byte[100];
			System.out.println("Enter the data");
			int k = System.in.read(b);
			fos.write(b, 0, k);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream(f)) {
			byte b[] = new byte[(int) f.length()];
			fis.read(b);
			String ss = new String(b);
			System.out.println(ss);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
