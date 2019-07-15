import java.util.*;
public class Matrix
{
	public static void main(String args[])
	{
		int i,j,k,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row of 1st matrix:");
		int r1=s.nextInt();
		System.out.println("Enter column of 1st matrix:");
		int c1=s.nextInt();
		System.out.println("Enter rows of 2nd matrix:");
		int r2=s.nextInt();
		System.out.println("Enter columns of 2nd matrix:");
		int c2=s.nextInt();
		if(c1!=r2)
		{
				System.out.println("Matrix not possible:");
		}
		else
		{
			int[][] m1=new int[r1][c1];
			int[][] m2=new int[r2][c2];
			int[][] mul=new int[r1][c1];
			System.out.println("Enter matrix1:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print("Enter m1["+i+"]["+j+"]:");
					m1[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter matrix2:");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print("Enter m2["+i+"]["+j+"]:");
					m2[i][j]=s.nextInt();
				}
			}
			System.out.println("Matrix1");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(" "+m1[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println("Matrix2");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(" "+m2[i][j]);
				}
				System.out.println(" ");
			}
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					mul[i][j]=0;
					for(k=0;k<r1;k++)
					{
						mul[i][j]=mul[i][j]+m1[i][k]*m2[k][j];
					}
				}
			}
			System.out.println("Matrix multiplication");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(" "+mul[i][j]);
				}
				System.out.println(" ");
			}
		}
	}
}