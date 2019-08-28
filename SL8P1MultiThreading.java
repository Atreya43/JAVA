/*
Write a Java program to do the following using threads created by extending Thread class,
 Create 3 threads and display their properties as [thread-name, priority, group-name
  ] – also display similar properties for main thread.
 Override run() methods in the threads to display numbers from 1 to 5,
  1 to 6 and 1 to 7 respectively.
 Use following methods in the program as explained,
   isAlive() – show whether the three threads are alive before and after using the
    start() method
   sleep() – Use 100, 200 and 300 milliseconds as the argument for the three threads
    respectively
 Display messages to indicate start and end of the 3 threads as well as the main thread.

*/
class Thread1 extends Thread
{
	public String nm;
	public Thread1(String nm)
	{
		this.nm = nm;
		System.out.println("Creating Thread : " + nm);
	}

	public void run()
	{
		System.out.println("Running Thread : " + nm);
		add();
	}

	public void add()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread1 " +i);
			try
			{
				sleep(100);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}
}

class Thread2 extends Thread
{
	public String nm;
	public Thread2(String nm)
	{
		this.nm = nm;
		System.out.println("Creating Thread : " + nm);
	}

	public void run()
	{
		System.out.println("Running Thread : " + nm);
		add();
	}

	public void add()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println("Thread2 " +i);
			try
			{
				sleep(200);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}
}

class Thread3 extends Thread
{
	public String nm;
	public Thread3(String nm)
	{
		this.nm = nm;
		System.out.println("Creating Thread : " + nm);
	}

	public void run()
	{
		System.out.println("Running Thread : " + nm);
		add();
	}

	public void add()
	{
		int sum = 0;
		for(int i=1;i<=7;i++)
		{
			System.out.println("Thread3 " + i);
			try
			{
				sleep(300);
			}
			catch(Exception e)
			{
				System.out.println("Error : " + e.toString());
			}
		}
		System.out.println();
	}

}

public class SL8P1MultiThreading
{

	public static void main(String args[])
	{
		Thread1 th1 = new Thread1("First Thread!");
		Thread t1 = new Thread (th1);
		t1.start();
		System.out.println("t1 IsAlive()" +t1.isAlive());
		System.out.println("t1 Priority" +t1.getPriority());
		System.out.println(t1);


		Thread2 th2 = new Thread2("Second Thread!");
		Thread t2 = new Thread (th2);
		t2.start();
		System.out.println("t2 IsAlive()" +t2.isAlive());
		System.out.println(t2);
		System.out.println("t2 Priority" +t2.getPriority());
		System.out.println(t2);

		Thread3 th3 = new Thread3("Thired Thread!");
		Thread t3 = new Thread (th3);
		t3.start();
		System.out.println("t3 IsAlive()" +t3.isAlive());
		System.out.println(t3);
		System.out.println("t3 Priority" +t3.getPriority());
		System.out.println(t3);
	}
}