package corejava.streams.assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * Question:

define a class Player
 	with
		int playerid
		String name
		int runs
		String countryname

		define
			parameterized constructor and getter methods
 */
class Player
{
	private  int playerid;
	private String name;
	private int runs;
	private String countryname;
	
	public Player(int playerid,String name,int runs,String countryname)
	{
		this.playerid=playerid;
		this.name=name;
		this.runs=runs;
		this.countryname=countryname;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
		
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + ", runs=" + runs + ", countryname=" + countryname
				+ "]";
	}
	
	
}
/*
 * create 10 players and store them inside a list.

using java8 stream api:

1) display all the players representing "India".

	hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.
 */
public class Q3 {

	public static void main(String[] args) 
	{
		Player p1=new Player(218,"Virat Kohali",31000,"India");
		Player p2=new Player(261,"Rohit Sharma",18000,"India");
		Player p3=new Player(209,"Jos Buttler",3000,"England");
		Player p4=new Player(223,"Quantion De-Cock",19000,"South Africa");
		Player p5=new Player(266,"David Warner",17000,"Australia");
		Player p6=new Player(283,"Babar Aazam",16000,"Pakistan");
		Player p7=new Player(200,"Rishabh Pant",4000,"India");
		Player p8=new Player(214,"Steve Smith",29000,"Australia");
		Player p9=new Player(218,"Shreyas Iyer",4500,"India");
		Player p10=new Player(211,"Ian Bell",14000,"England");
		
		List<Player> list=new ArrayList<Player>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		
		/*
		 * 1) display all the players representing "India".

			hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.

		 */
		
		list.stream().filter((Player)->{return Player.getCountryname().equalsIgnoreCase("India");}).forEach(System.out::println);
		/*
		 * 2) find out how many players have scored more than 5000 runs.

			hint:- use "filter" to check players scored more than 5000 runs and "count" method to count them.
			
		 */
		System.out.println();
		System.out.println("Number of Player who got more than 5000 runs");
		System.out.println(list.stream().filter((Player)->{return Player.getRuns()>5000;}).count());
	}

}
