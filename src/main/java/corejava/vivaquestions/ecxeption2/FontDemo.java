package corejava.vivaquestions.ecxeption2;

import corejava.vivaquestions.ecxeption2.Font.MyFont;

public class FontDemo {
	
	public static void main(String[] args) 
	{		
		Font f1=null;
		try {
		f1=new Font(MyFont.BOLT);
		
		} catch (IllegalValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1);
		System.out.println("Done");
		
	}

}
