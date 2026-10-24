package corejava.nio.stream_with_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) 
	{	System.out.println("To LowerCase");
		try(Stream<String>stream=Files.lines(Paths.get("C:\\NIO\\Demo.txt")))
		{
			stream.map(String::toLowerCase).forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*****************************************************");
		System.out.println("To UpperCase");
		try(Stream<String>stream=Files.lines(Paths.get("C:\\NIO\\Demo.txt")))
		{
			stream.map(String::toUpperCase).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
