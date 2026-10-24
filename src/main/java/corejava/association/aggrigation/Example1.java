package corejava.association.aggrigation;
class Teacher
{

	int age;
	String name;
	
	public Teacher(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void work()
	{
		System.out.print("Name: "+name+" is working in ");
	}
}
class Department
{
	public Teacher teacher;
	String dName;
	
	public Department(String dName)
	{	teacher=null;
		this.dName=dName;
	}
	
	public String getdName() 
	{
		return dName;
	}

	public void setdName(String dName) 
	{
		this.dName = dName;
	}

	public void addTeacher(Teacher teacher)
	{
		this.teacher=teacher;
	}
	public void perform()
	{
		teacher.work();
		System.out.println(dName+" Department");
	}

}
public class Example1 
{

	public static void main(String[] args) 
	{
		Department d1=new Department("Science");
		//Department d2=new Department("Math's");
		Teacher t1=new Teacher(34,"Manisha");
		d1.addTeacher(t1);
		d1.perform();
		d1=null;//deleting Math's department
		System.out.println(t1.name);//still we can have teacher
		System.out.println(t1.getAge());
//		d2.addTeacher(t1);
//		d2.perform();
		

	}

}
