//write a java program to Find the sum of the all even index elements in an Array
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int sum =0;
		
		System.out.println("Enter the elements of the Array");
		for (int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Printing the sum of the all even index elements in an Array");
		for (int i=0;i<arr.length;i++) {
			if(i%2 == 0) {
			sum += arr[i];
			}
		}
		System.out.println(sum);
		

	}

}
