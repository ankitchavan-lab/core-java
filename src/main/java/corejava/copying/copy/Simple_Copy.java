
package corejava.copying.copy;

import java.util.Arrays;

//class PrnNumber
//{
//	
//}
class Center
{	
	private String name;
	private int prnnos[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPrnnos() {
		return prnnos;
	}
	public void setPrnnos(int[] prnnos) {
		this.prnnos = prnnos;
	}
	public Center(String name, int[] prnnos) {
		
		this.name = name;
		this.prnnos = prnnos;
	}
	@Override
	public String toString() {
		return "Center [name=" + name + ", prnnos=" + Arrays.toString(prnnos) + "]";
	}
	
}
public class Simple_Copy {

	public static void main(String[] args) {
		Center c1=new Center("SM_VITA",new int[]{100,200,300,400,500});
		System.out.println(c1);
		//what if we want to copy the prnnos which are in object of center
		int temp[]=c1.getPrnnos();
		//and if we want change some prn value in this temp 
		//it will directly affect the prnnos which are in the object
		//because temp is ref. to the same object where prnnos is referring
		temp[3]=780;// it will affect the prnnos also
		System.out.println(c1);
		
		

	}

}
