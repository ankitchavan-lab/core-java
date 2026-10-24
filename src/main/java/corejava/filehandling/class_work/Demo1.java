package corejava.filehandling.class_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\LENOVO\\Desktop\\FileIO\\Test1.java");
		if (!f.exists()) {
			System.out.println("File is Unavialable");
			System.exit(0);
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
