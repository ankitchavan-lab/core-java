package corejava.exceptions.assignment;
/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;
parameterized constructor which will accept above details at the time
of creating object.
member function
void display()
which will display all the details of product
create instances of this class and call the method display.*/
class Item
{
	String itemid;
	String name;
	int cost;
	public Item(String itemid, String name, int cost) 
	{
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	public void display()
	{
		System.out.println("Item_ID: "+itemid);
		System.out.println("Name: "+name);
		System.out.println("Cost: "+cost+"/-");
	}
	
}
public class Q4 
{

	public static void main(String[] args) 
	{
		Item i1=new Item("AE12B","Washing_Powder",230);
		i1.display();
		
	}

}
