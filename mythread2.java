public class mythread2
{
	public static void main(String args[])
	{
		threadc1 t1 = new threadc1();
		threadc2 t2 = new threadc2();
		threadc3 t3 = new threadc3();

		Thread maint1 = new Thread(t1);
		maint1.start();
		maint1.setPriority(10);
		Thread maint2 = new Thread(t2);
		maint2.start();
		maint2.setPriority(9);
		Thread maint3 = new Thread(t3);
		maint3.start();
		maint3.setPriority(8);


		int show_result =0;
		show_result=(t1.resultTh1+t2.resultTh2+t3.resultTh3);
		System.out.println("Final total : "+show_result);


	}
}

class threadc1 implements Runnable
{
	public int resultTh1=0;
	public void run()
	{

		for(int i=1;i<=10000;i++)
		{
			resultTh1+=i;
		}
		System.out.println("First thread result : "+ resultTh1);
	}


}

class threadc2 implements Runnable
{
	public int resultTh2=0;
	public void run()
	{

		for(int i=10001;i<=20000;i++)
		{
			resultTh2+=i;
		}
		System.out.println("Second thread result : "+resultTh2);
	}

}

class threadc3 implements Runnable
{
	public int resultTh3=0;
	public void run()
	{

		for(int i=20001;i<30000;i++)
		{
			resultTh3+=i;
		}
		System.out.println("third thread result : "+resultTh3);
	}


}