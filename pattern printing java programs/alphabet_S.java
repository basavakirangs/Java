
public class alphabet_S {
	public static void main(String[] args) {
		for ( int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if ( (j==1 && i<5) || i==1 || i==9 || i==5 || (j==9 && i>5))
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
