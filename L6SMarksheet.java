/*
							Inner Class and Object Clonning
Create outer class Student having rollno,name and display data method,Create an inner
class.Sessional having data members subject1,subject2,subject3,subject4,subject5,marks,
total and percentage. Inner class Sessional contain gettotal and getpercentage methods
in it. Display Student name, roll no, total and percentage using methods...
*/
import java.util.*;
class Student
{
	int rollno;
	String name;
	Sessional s;
	public Student(int rollno,String name)
	{
		s= new Sessional();
		this.rollno = rollno;
		this.name= name;
	}
	void display()
	{
		s.getmarks();
		int tot = s.gettotal();
		float per = s.getper();
		System.out.println("Roll Number : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Total : "+tot);
		System.out.println("Percentage : "+per);
	}
	class Sessional
	{
		public int sub[];
		public int total=0;
		public Sessional()
		{
			sub = new int[5];
		}
		public void getmarks()
		{
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter Subject : ["+i+"] Marks : ");
				sub[i] = sc.nextInt();
			}
		}
		public int gettotal()
		{
			for(int i=0;i<5;i++)
			{
				total = total + sub[i];
			}

			return total;
		}
		public float getper()
		{
			float per;
			per = total/5;
			return per;
		}
	}
}
public class L6SMarksheet{
	public static void main(String args[])
	{
		Student s= new Student(101,"Sohel");
		s.display();
	}
}