package corejava.association.composition;

import java.util.Scanner;

class Room
{
	private String name;

	public Room(String name) 
	{
		this.name = name;
	}

	public Room() 
	{
		this.name=null;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
}
class House
{
	private String name;
	private String address;
	private int no_rooms;
	private Room rooms[];//has a
	
	public House(String name, String address, int no_rooms) 
	{
		this.name = name;
		this.address = address;
		this.no_rooms = no_rooms;
		String room_name;
		this.rooms=new Room[no_rooms];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<rooms.length;i++)
		{	System.out.println("Enter the room name");
			room_name=sc.next();
			this.rooms[i]=new Room();
			this.rooms[i].setName(room_name);
		}
				
	}
	public String getName() 
	{
		return name;
	}
	public String getAddress() 
	{
		return address;
	}
	public int getNo_rooms() 
	{
		return no_rooms;
	}
	public void showRooms()
	{
		for(int i=0;i<rooms.length;i++)
		{
			System.out.println(rooms[i].getName());
		}
	}
	
}
public class Example1
{

	public static void main(String[] args) 
	{
		House h1=new House("Dwarka Niwas","Khargar Mumbai",3);
		System.out.println("The house has following rooms");
		h1.showRooms();

	}

}
