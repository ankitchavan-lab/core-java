package corejava.fundamentals.oop;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student student = new Student("Asha", 101);
		student.setName("Asha Kumar");

		System.out.println("Student: " + student.getName());
		System.out.println("Roll number: " + student.getRollNumber());
	}
}
