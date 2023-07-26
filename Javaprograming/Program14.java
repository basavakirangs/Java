//write a java program to find the smallest elements in an array 
import java.util.Scanner;
public class Program14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int large =0;
		
		System.out.println("Enter the elements of the Array");
		for (int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Printing the the smallest elements in an array");
		large = arr[0];
		for (int i=0;i<arr.length;i++){
			{
			
			if(arr[i] <= large) {
				large = arr[i];
			}
			
		}
		
		}
		
		System.out.println(large);
	}
}




