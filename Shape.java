import java.util.*;
class Rectangle
{
	float l,b;
	Rectangle(float l1,float b1)
	{
		l=l1;
		b=b1;
	}
	void area()
	{
		float ans=l*b;
		System.out.println("Area of rectangle"+ans);
	}
}
class Circle
{
	static final float pi=3.14f;
	double r;
	Circle(double r1)
	{
		r=r1;
	}
	void area()
	{
		double ans=pi*r*r;
		System.out.println("Area of circle:"+ans);
	}
}
class Triangle
{
	double l,h;
	Triangle(double l1,double h1)
	{
		l=l1;
		h=h1;
	}
	void area()
	{
		double ans=0.5*l*h;
		System.out.println("Area of triangle:"+ans);
	}
}
public class Shape
{
	public static void main(String args[])
	{
		System.out.println("Area of rectangle:");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		float l=s.nextFloat();
		System.out.println("Enter breadth:");
		float b=s.nextFloat();
		Rectangle r=new Rectangle(l,b);
		r.area();
		System.out.println("Area of circle:");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r1=s1.nextDouble();
		Circle c=new Circle(r1);
		c.area();
		System.out.println("Area of triangle:");
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter base:");
		double l1=s2.nextDouble();
		System.out.println("Enter height:");
		double h=s2.nextDouble();
		Triangle t=new Triangle(l1,h);
		t.area();
	}
}
