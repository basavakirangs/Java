
public class Student {
	private int id;
	private String name;
	private int marks;
	public void setdata(int x, String y,int z) {
		if (x>0){
			id=x;
		}
		else {
			System.out.println("Invalid Entry");
		}
		if (y.equals("") == false) {
		name=y; 
		}
		else {
			System.out.println("Invalid Entry");
		}
		if (z>=0) {
		marks=z;
		}
		else {
			System.out.println("Invalid Entry");
		}
		
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getmarks()
	{
		return marks;
	}
	public void eat()
	{
		System.out.println(name+" is eating");
	}
	public void study()
	{
		System.out.println(name+" is studying");
	}
	public void sleep()
	{
		System.out.println(name+" is sleeping");
	}

}
