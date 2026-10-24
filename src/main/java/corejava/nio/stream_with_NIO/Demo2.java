package corejava.nio.stream_with_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) 
	{
		try {
			//creating Stream which will contain path
			Stream<Path>stream =Files.list(Paths.get("C:\\FileIO"));
			//System.out.println(stream);
			System.out.println("*********************************");
		//	stream.forEach(System.out::println);//forEach(BiConsumer)//to printwhich has accept()
			
			System.out.println("Retuns only files with .txt extention");
			stream.map(String::valueOf).filter(path->path.endsWith(".txt")).forEach(System.out::println);
			stream.close();
			//map() is for converting stream which contain path to stream which contain string
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

}
