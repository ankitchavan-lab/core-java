package corejava.filehandling.class_work;

import java.io.*;


public class DemoPrimi {

	public static void main(String[] args) 
	{
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\primitive.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				dos.writeInt(10);
				dos.writeChar('A');
				dos.writeFloat(3.9f);
				dos.writeBoolean(true);
				dos.writeUTF("hello world");
				
			}
			
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\primitive.txt"))
		{
				try(DataInputStream dis=new DataInputStream(fis))
				{
					System.out.println(dis.readInt());
					System.out.println(dis.readChar());
					System.out.println(dis.readFloat());
					System.out.println(dis.readBoolean());
					System.out.println(dis.readUTF());
				}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
