public class mythread1
{
	public static void main(String args[])
	{
		Thread myt = Thread.currentThread();
		System.out.println("Main thread : "+myt);
		threadpro1 t1 = new threadpro1("mythread1");
		t1.start();
		t1.setPriority(6);
		System.out.println("check first thread alive : "+t1.isAlive());
		System.out.println("Priority of first thread : "+t1.getPriority());
		System.out.println("Thread group name : "+t1.getName());


		threadpro2 t2 = new threadpro2("mythread2");
		t2.start();
		t2.setPriority(8);
		System.out.println("check second thread alive : "+t2.isAlive());
		System.out.println("Priority of second thread : "+t2.getPriority());
		System.out.println("Thread group name : "+t2.getName());

		threadpro3 t3 = new threadpro3("mythread3");
		t3.start();
		t3.setPriority(7);
		System.out.println("check third thread alive : "+t3.isAlive());
		System.out.println("Priority of second thread : "+t3.getPriority());
		System.out.println("Thread group name : "+t3.getName());



	}
}

class threadpro1 extends Thread
{
	private String tname;

	threadpro1(String name)
	{
		tname = name;
		System.out.println("Thread one  name : "+tname);
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread 1 :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ tname + " is interrupted !");
		}
		System.out.println("Thread one finish!");
	}

}

class threadpro2 extends Thread
{
	private String tname;

	threadpro2(String name)
	{
		tname = name;
		System.out.println("Thread two name : "+tname);
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=6;i++)
			{
				System.out.println("thread 2 : "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ tname + " is interrupted !");
		}
		System.out.println("Thread two finish !");
	}

}

class threadpro3 extends Thread
{
	private String tname;

	threadpro3(String name)
	{
		tname = name;
		System.out.println("Thread three name : "+tname);
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=7;i++)
			{
				System.out.println("thread 3: "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ tname + " is interrupted !");
		}
		System.out.println("Thread three finish !");
	}

}