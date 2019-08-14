import java.util.*;

public class Inner_cloning
{
	public static void main(String args[])
	{

		Student s = new Student();
		s.getData();


		Student.Sessional ss = new Student().new Sessional();
		ss.getMarks();
		s.displayData();
		ss.getTotal();
		ss.getPercentage();
	}

}

class Student
{
	Scanner s = new Scanner(System.in);
	private int rollno;
	private String name;

	public void getData()
	{
		System.out.println("Enter name : ");
		name=s.nextLine();
		System.out.println("Enter RollNo : ");
		rollno=s.nextInt();
	}

	public void displayData()
	{
		System.out.println("Student name is "+name + " and rollno is "+rollno);
	}

	class Sessional
	{
		private int subject1,subject2,subject3,subject4,subject5;
		private float Percent=0;
		private int Total=0;

		public void getMarks()
		{
			System.out.println("Subject 1: ");
			subject1=s.nextInt();
			System.out.println("Subject 2: ");
			subject2=s.nextInt();
			System.out.println("Subject 3: ");
			subject3=s.nextInt();
			System.out.println("Subject 4: ");
			subject4=s.nextInt();
			System.out.println("Subject 5: ");
			subject5=s.nextInt();
		}

		public void getTotal()
		{
			Total=subject1+subject2+subject3+subject4+subject5;
			System.out.println("Total is "+Total);
		}
		public void getPercentage()
		{
			Percent = (100*(float)Total)/500;
			System.out.println("Percentage is "+Percent);
		}

	}
}