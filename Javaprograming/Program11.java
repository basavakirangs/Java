//write a java program to Find the Average of the all elements present in an Array
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int sum =0;
		int avg=0;
		
		System.out.println("Enter the elements of the Array");
		for (int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Printing the Average of the all elements in an Array");
		for (int i=1;i<arr.length;i++) {
			
			sum += arr[i];
			
			
		}
		avg = sum/arr.length;
		System.out.println(sum);
		System.out.println(arr.length);
		System.out.println(avg);
		

	}

}
