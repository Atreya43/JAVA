/*
									LAB 7 Program 1
Write a program which takes username(only alphabets),Semester(integer) from the user
If user will enter wrong datatype in it then display exception message to user using
			  try catch final block which display proper message in it.
*/
import java.util.*;
class User
{
	public String un;
	public int sem;
	public void get_details(String un,int sem)
	{
		this.un = un;
		this.sem = sem;
	}
	public void display()
	{
		System.out.println("Username : "+un);
		System.out.println("Semester : "+sem);
	}
}
public class L7P1CheckUser
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String un;
	 	int sem;
		User u = new User();
		try
		{
			System.out.println("Enter Username : ");
			un=sc.next();
			System.out.println("Enter Semester : ");
			sem= sc.nextInt();
			u.get_details(un,sem);
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Error : "+e1.toString());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.toString());
		}
		finally
		{
			System.out.println("Final block Execute");
		}
	}
}