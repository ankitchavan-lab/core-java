package corejava.vivaquestions.exception3;

public class VoteDemo {

	public static void main(String[] args) 
	{
		Voter v1=null;
		Voter v2=null;
		try {
			//v1= new Voter("Ankit",24);
			//System.out.println(v1);
			v2=new Voter("Pramila",66);
			System.out.println(v2);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
		

	}

}
