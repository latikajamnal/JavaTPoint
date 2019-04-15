package twelvethAprilArray;

public class LargestAndSmallestinArr
{
	public static void main(String[] args) 
	{
		int arr[]= {5,34,763,2,12,56,90,13};
		int min=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min: "+min);
	}
}
