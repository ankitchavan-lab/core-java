package corejava.nio.stream_with_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) 
	{
		//ARM block
		try (Stream<Path>stream=Files.find(Paths.get("C:\\FileIO"), 2,(Path,attr)->String.valueOf(Path).endsWith(".txt")))
		{												
	//Stream<Path>stream=Files.find(Paths.get("C:\\FileIO"), 2,(Path,attr)->String.valueOf(Path).endsWith(".txt"))
			stream.forEach(System.out::println);
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
