package twelvethAprilArray;

public class rightRotate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		for(int j=0; j<3;j++)
		{
			int last = arr[arr.length-1];
			for(int i = arr.length-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[0]=last;
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
