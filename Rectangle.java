import java.util.*;
public class Rectangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		float len=s.nextFloat();
		System.out.println("Enter width:");
		float wid=s.nextFloat();
		System.out.println("Area of rectangle:"+len*wid);
	}
}