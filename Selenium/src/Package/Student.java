package Package;

import Package.Student;

public class Student {

	int age;
	int rollno;
	
	public void Display1 ()
	{
		System.out.println("Welcome all of You");
	}
	public void Display2() 
	{
		System.out.println("Automation is Very Easy");
	}
	
	public static void main(String[] args) 
	{
		Student Pratham = new Student();
		Pratham.age = 25;
		Pratham.rollno = 10;
		System.out.println(Pratham.age);
		System.out.println(Pratham.rollno);
		Pratham.Display1();
		Pratham.Display2();
				
	}
	

}
