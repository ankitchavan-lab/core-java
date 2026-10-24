package corejava.serialization.assignment;

import java.io.Serializable;

/*
 * 
2) Person class implements Serializable with
	private String name
	private int age
		getters and setters
		parameterized constructor
Student extends Person
	private int rollno
		getter and setters
		parameterized constructor accepting name,age and rollno
			pass name and age to the super constructor
 */
class Person implements Serializable
{
	private String name;
	private int age;
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
}
class Student extends Person
{
	private int roll_no;
	
	public Student(String name, int age,int roll_no) {
		super(name, age);
		this.roll_no=roll_no;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
}
