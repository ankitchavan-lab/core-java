package corejava.copying.copy;

import java.util.Arrays;

class Center1
{
	private String name;
	private String address;
	private int prn[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int[] getPrn() {
		int prncopy[]= prn.clone();
		//Arrays class has override clone() method so we don't have to override it in same class
		//for(int i=0;i<prn.length;i++)
		//{
			//prncopy[i]=prn[i];
		//}
		return prncopy;
	}
	public void setPrn(int[] prn) {
		this.prn = prn;
	}
	public Center1(String name, String address, int[] prn) {
		
		this.name = name;
		this.address = address;
		this.prn = prn;
	}
	@Override
	public String toString() {
		return "Center1 [name=" + name + ", address=" + address + ", prn=" + Arrays.toString(prn) + "]";
	}
	
}

public class With_Copy 
{

	public static void main(String[] args) 
	{
		Center1 c1= new Center1("SM_Vita","Mumbai",new int []{200,300,400,500,909});
		System.out.println(c1);
		int temp[]=c1.getPrn();
		temp[0]=1111;// now this will not affect the "prn" as we are 
		//creating copy and then sending it to the main
		//but it will take time if as there may be posssiblility of bigger array of 
		//prnnos which will take time
		//so for that we need to find some efficient alternate 
		//we can simply use clone() to make a copy 
		//**** now we will get same output
		System.out.println(c1);
		System.out.println(Arrays.toString(temp));

	}

}
