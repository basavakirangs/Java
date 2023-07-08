
public class squareshapewithdiag {
	public static void main(String[] args) {
		for ( int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if ( i==1 || j==1 || j==9 || i==9 || i==j || i+j==10 || i==5 || j==5 || j-i==4 || i+j==6 || i+j==14 || i-j==4)
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
}
