import java.util.*;
class Sum
{
	void sum()
	{
		int ans;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1:");
		int n1=s.nextInt();
		System.out.println("Enter number2:");
		int n2=s.nextInt();
		ans=n1+n2;
		System.out.println("Sum of two number:"+ans);
	}
	void sum(int n1,int n2)
	{
		int ans;
		ans=n1+n2;
		System.out.println("Sum of two number:"+ans);
	}
	void sum(double d1,double d2)
	{
		double ans;
		ans=d1+d2;
		System.out.println("Sum of two number:"+ans);
	}
	void sum(int n1)
	{
		float ans;
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter number2:");
		float n2=s2.nextFloat();
		ans=n1+n2;
		System.out.println("Sum of two number:"+ans);
	}
	void sum(float f1,float f2)
	{
		float ans;
		ans=f1+f2;
		System.out.println("Sum of two numbers:"+ans);
	}
}
public class Calculator
{
	public static void main(String args[])
	{

		Sum s=new Sum();
		System.out.println("Function sum() is called:");
		s.sum();
		System.out.println("Function sum(int n1,int n2) is called:");
		Scanner x=new Scanner(System.in);
		System.out.println("Enter number1:");
		int c=x.nextInt();
		System.out.println("Enter number2:");
		int d=x.nextInt();
		s.sum(c,d);
		System.out.println("Function sum(double d1,double d2) is called:");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number1:");
		double n1=s1.nextDouble();
		System.out.println("Enter number2:");
		double n2=s1.nextDouble();
		s.sum(n1,n2);
		System.out.println("Function sum(float f1,float f2) is called:");
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter number1:");
		float p=s4.nextFloat();
		System.out.println("Enter number2:");
		float q=s1.nextFloat();
		s.sum(p,q);
		System.out.println("Function sum(int n1) is called:");
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter number1:");
		int a=s3.nextInt();
		s.sum(a);
	}
}