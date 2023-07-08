
public class triangle {

	public static void main(String[] args) {
		for ( int i=1;i<=5;i++)
		{
			for ( int j=1;j<=5;j++) {
				if (i==j || j==5 || i == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (int k=1;k<=5;k++)
			{
				if (k+i==6 || i==5 || k==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		for ( int i=1;i<=5;i++)
		{
			for ( int j=1;j<=5;j++) {
				if (i+j==6 || j==1 || i == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (int k=1;k<=5;k++)
			{
				if (k==i || i==5 || k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
	}
	}

}
