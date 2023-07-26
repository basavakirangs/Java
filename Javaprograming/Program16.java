// write a java program to find factorial of given numbers from the user
import java.util.Scanner;
public class Program16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers to find the factorial");
		int n= scan.nextInt();
		Factorial Fact = new Factorial();
		int res = Fact.fact(n);
		System.out.println("Factorial of the give number "+n+" is "+res);
		

	}

}
