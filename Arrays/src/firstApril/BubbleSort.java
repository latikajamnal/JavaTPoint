package firstApril;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int n = scan.nextInt();
		int arr[]= new int [n];
		
		//Inserting values in Array
		for(int i=0; i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//Displaying Initial Array
		for(int i=0; i<n;i++)
		{
			System.out.println("Arr["+i+"]: "+arr[i]);
		}
		
		//Sorting
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				int temp;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("***********************************");
		//Displaying Final Array
		for(int i=0; i<n;i++)
		{
		System.out.println("Arr["+i+"]: "+arr[i]);
		}
	}

}
