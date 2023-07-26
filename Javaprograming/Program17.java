import java.util.Scanner;
public class Program17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int size = scan.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter the elements of the Array");
		for (int i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}
		int high = arr.length-1;
		int low = 0;
		System.out.println("Enter the key to be found from the Array");
		int key = scan.nextInt();
		binarysearch bin =new binarysearch();
		int res = bin.bin(arr, key, high, low);
		if (res >=0)
		{
		System.out.println("The index of the key in Array is "+res);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

}
