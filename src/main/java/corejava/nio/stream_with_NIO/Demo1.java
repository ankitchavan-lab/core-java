package corejava.nio.stream_with_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) 
	{
		try {
			//creating Stream which will contain path
			Stream<Path>stream =Files.list(Paths.get("C:\\FileIO"));
			System.out.println(stream);
			System.out.println("*********************************");
			stream.forEach(System.out::println);//forEach(BiConsumer)//to printwhich has accept()
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
