public class Pattern
{
	public static void main(String args[])
	{
		int i,j,s,k,l;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("a");

			}

			for(s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("a");
			}

			System.out.println();

		}
		for(i=2;i>=1;i--)
		{
			for( j=i;j>=1;j--)
			{
				System.out.print("a");
			}
			for(s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("a");
			}

			System.out.println();
		}

	}
}