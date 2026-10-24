package corejava.streams.assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * Question

define a class Student 
	rollno
	name
	age
	marks
	parameterized constructor 
	getter methods

	create 5 objects and store them inside list.
 */
class Student
{
	private int rollno;
	private String name;
	private int age;
	private int marks;
	public Student(int rollno, String name, int age, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
}
public class Q2 {
	/*
	 * create 5 objects and store them inside list.

	using java8 stream api:

	 */

	public static void main(String[] args) 
	{
		Student s1=new Student(016,"Ankit",24,78);
		Student s2=new Student(067,"Sujata",22,54);
		Student s3=new Student(065,"Suraj",27,78);
		Student s4=new Student(012,"Amrita",22,78);
		Student s5=new Student(011,"Akshay",23,78);
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s5);
		list.add(s5);
		/*
		 * 1) find out name starts with 's'

		hint:- use "filter" to check names start with "s" and "forEach" method to display all those names.

		 */
		//stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		//list.stream().forEach((Student)->Student.getName().startsWith("s"))
		System.out.println("Students who got name starts with 'S': ");
		list.stream().filter((Student)->Student.getName().startsWith("S")).forEach(System.out::println);
		
		/*
		 *
			2) how many students got more than 70

			hint: use "filter" and "count"
		 */
		System.out.println();
		System.out.print("No of people who got more than 70: ");
		System.out.println(list.stream().filter((Students)->{return Students.getMarks()>70;}).count());
		
		/*
		 * 
			3) how many students in between age 22 and 25
	
			hint: use "filter" and "count"

		 */
		System.out.println();
		System.out.println("No of Students who got age in between 22 and 25");
		System.out.println(list.stream().filter((Student)->{return Student.getAge()>22&&Student.getAge()<25;}).count());
	}

}
