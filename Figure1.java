public class Figure1
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=2*n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j+=2)
				System.out.print("*");
			System.out.println();
		}
	}
}


