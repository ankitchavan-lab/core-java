package corejava.interfaces.inheritance_assignment1;
/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and 
"Parent2", instantiate it and call the members.*/
class Parent1
{
	//father
	String surname="Chavan";
	
	public void disp1()
	{
		System.out.println("Surname: "+surname);
	}
}
interface Parent2
{
	//mother
	String motherName="Aasha";
	
	public void disp2();
	
}
class Child extends Parent1 implements Parent2
{

	@Override
	public void disp2() 
	{	
		disp1();
		System.out.println();
		System.out.println("GrandMother name: "+motherName);
		
	}
	

}
public class Q7 
{

	public static void main(String[] args) 
	{
		Child c1=new Child();
		c1.disp2();
		

	}

}
