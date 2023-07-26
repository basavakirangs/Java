
public class fan {
	private int no_of_blades;
	private String color;
	private String brand;
	private int cost;
	public void setdata(int x, String y,String z, int a)
	{
		if (x >= 3)
		{
			no_of_blades =x;
		}
		else
		{
			System.out.println(x + "is not a vaild no of blades");
		}
		if (y.equals("") == false )
		{
			color = y;
		}
		else 
		{
			System.out.println(y + " is not a valid color name");
		}
		if (z.equals("") == false )
		{
			brand = z;
		}
		else 
		{
			System.out.println(z + " is not a vaild brand");
		}
		if (a >0 )
		{
			cost = a;
		}
		else 
		{
			System.out.println(a +" is not vaild cost price");
		}

	}
	public int getNo_of_blades() {
		return no_of_blades;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public int getCost() {
		return cost;
	}
	public void rotate() {
		System.out.println(no_of_blades+" "+brand+" "+color+" "+cost+" Is rotating");

	}

}
