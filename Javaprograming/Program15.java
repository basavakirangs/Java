// write a java program to find GCD of given two numbers from the user
import java.util.Scanner;
public class Program15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 2 numbers to find the GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		GCD gcd = new GCD();
		int res = gcd.gcd(m, n);
		System.out.println("GCD of "+ m+" and "+ n+" is "+ res);
		

	}

}
