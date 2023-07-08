
public class Printingstar {

	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		for (int i =1;i<=4;i++)
		{
			for (int k=1;k<=7;k++)
			{
				if (k==m)
				{ 
					for(int j=m;j<=n;j++)
					{
						System.out.print("*");
					}
				}
				else if(k>(n))
				{
					
					System.out.print(" ");
				}
				else if(k<(m))
				{
				
					System.out.print(" ");
				}
			}
			m--;
			n++;
			System.out.println();
			}
		m = 2;
		n = 6;
		for (int i =1;i<=3;i++)
		{
			for (int k=1;k<=7;k++)
			{
				if (k==m)
				{
					for(int j=m;j<=n;j++)
					{
						System.out.print("*");
					}
				}
				else if(k>(n))
				{
					
					System.out.print(" ");
				}
				else if(k<(m))
				{
				
					System.out.print(" ");
				}
			}
			m++;
			n--;
			System.out.println();
			}
	      
		}
}
		
			