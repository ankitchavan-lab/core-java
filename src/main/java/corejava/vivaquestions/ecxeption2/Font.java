package corejava.vivaquestions.ecxeption2;

public class Font {
	String style;
	MyFont a;

	public enum MyFont 
	{
		PLAIN, BOLT, ITALIC // final and static
	}

	public Font(MyFont style) throws IllegalValueException 
	{
		//this.style = style;
		if (MyFont.BOLT.equals(style) || MyFont.BOLT.equals(style) || MyFont.BOLT.equals(style)) {
			System.out.println("BOLT");}
		else
			throw new IllegalValueException("Illegal Value of Style");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+a+"]";
	}
//	ExecutorService exec=Executors.newCachedThreadPoll();
	
}
