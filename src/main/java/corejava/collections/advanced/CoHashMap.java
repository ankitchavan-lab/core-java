package corejava.collections.advanced;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.*;

public class CoHashMap {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String,String> map=new ConcurrentHashMap();
		Set<Character> s=new TreeSet<>();
		
		s.add(null);
		s.add('V');
		s.add('g');
		s.add('r');
		s.add('a');
		s.add('n');
		System.out.println(s);

	}

}
