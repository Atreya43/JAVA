import java.util.*;
public class ExamResult
{
	public static void main(String args[])
	{

	}
}



class Sessional
{
	Scanner s  = new Scanner(System.in);
	private int Marks[][]=new int[3][5];
	private int Sessional_total=0;

	public void getMarks()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("Marks "+i+1+" sessional "+ j+1+"subject :");
				Marks[i][j]=s.nextInt();
			}
		}
	}

	public void getTotal()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				Sessional_total+=Marks[i][j];
			}
		}
		System.out.println("Total Marks : "+Sessional_total);
	}


}


interface Practical
{
	public void getPracMarks();
}

interface external extends Practical
{
	public void getExtMarks();
	public void getTWMarks();

}


class Result extends Sessional implements external
{
	Scanner s = new Scanner(System.in);
	private int extMarks[]=new int[5];
	private int TWMarks[]=new int[5];
	private int PracSub;
	private int PracMarks[]=new int[PracSub];
	private int ExtTotal=0;
	private int TWTotal=0;

	public void getMarks()
	{
		super.getMarks();
	}

	public void getTotal()
	{
		super.getTotal();
	}

	public void getExtMarks()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("External Marks for subject "+i+1+" : ");
			extMarks[i]=s.nextInt();
		}
	}

	public void getTWMarks()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Termwork Marks for subject "+i+1+" : ");
			TWMarks[i]=s.nextInt();
		}
	}

	public void getPracMarks()
	{
		for(int i=0;i<PracSub;i++)
		{
			System.out.println("Practical Marks for Subject "+i+1+" : ");
		}
	}

	public void getTotalExt()
	{
		for(int i=0;i<5;i++)
		{
			ExtTotal+=extMarks[i];
		}
		System.out.println("External total : "+ExtTotal);
	}

	public void getTotalTW()
	{
		for(int i=0;i<PracSub;i++)
		{
			TWTotal+=TWMarks[i];
		}
	}


}