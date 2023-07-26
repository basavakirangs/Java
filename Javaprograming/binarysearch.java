
public class binarysearch {
	int bin(int [] arr,int key, int high,int low)
	{
		int mid =(low+high)/2;
		if (low > arr.length-1 || high<0)
		{
			return -1;
		}
		else 
		{
			if (arr[mid] == key)
			{
				return mid;
			}
			else if (key > arr[mid])
			{
				return bin(arr, key,high,mid+1);
			}
			else if (key <arr[mid])
			{
				return bin(arr, key, mid-1,low);
			}
			else
				return -1;
		}

	}
}
