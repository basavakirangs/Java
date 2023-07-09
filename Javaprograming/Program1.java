//Write a program to read elements to a array and print the contents.
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Array elements");
		for (int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The array elements are:");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
