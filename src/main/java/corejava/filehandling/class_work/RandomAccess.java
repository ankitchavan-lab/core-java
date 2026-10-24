package corejava.filehandling.class_work;
import java.io.*;
public class RandomAccess {

	public static void main(String[] args) 
	{
		try(RandomAccessFile rf=new RandomAccessFile("C:\\FileIO\\random.txt","rw"))//Class which can both read and Write
		{
			rf.seek(rf.length());//setting pointer
			byte b[]=new byte[500];
			System.out.println("Enter Data");
			int k=System.in.read(b);//reading data
			rf.write(b,0,k);
			rf.seek(0);//after writing setting pointier to intial position so we can read
			byte r[]=new byte[(int) rf.length()];
			rf.read(r);
			System.out.println("Displaying Entered Data");
			String S=new String(r);
			System.out.println(S);//displaying data
			rf.seek(rf.length());//setting pointer before reading data
			System.out.println("Enter Data Again");
			byte l[]=new byte[500];
			System.in.read(l);//again reading data
			rf.write(l);
			rf.seek(0);//before reading final data setting 
			//pointer to the primary position
			System.out.println("Displaying Data From Begining");
			byte c[]=new byte[(int) rf.length()];
			rf.read(c);
			String ss=new String(c);//again displaying data
			System.out.println(ss);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thank You!!0");

	}

}
