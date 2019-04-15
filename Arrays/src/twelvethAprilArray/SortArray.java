package twelvethAprilArray;

public class SortArray {

	public static void main(String[] args)
	{
		int arr[]= {3,6,5,4,2,1};
		int temp=0;
		for(int n=0;n<arr.length;n++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
