//write a java program to print elements present in even elements in an Array 
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the Array");
		for (int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Printing the even elements in the Array");
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
