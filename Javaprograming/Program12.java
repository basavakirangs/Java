//write a java program to print the elements of an array in reverse order
import java.util.Scanner;
public class Program12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		
		System.out.println("Enter the elements of the Array");
		for (int i=0;i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Printing the elements of an array in reverse order");
		
		int res[] =new int[size];
		int j = res.length-1;
		for (int i=0;i<arr.length;i++) {
		
			res[j]=arr[i];
			j--;
		}
		for (int i=0;i<res.length;i++) {
		System.out.println(res[i]+" ");
		}
	}

}
