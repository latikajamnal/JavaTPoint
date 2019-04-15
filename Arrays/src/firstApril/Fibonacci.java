package firstApril;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements to be represented in series: ");
		int numberOfElements = scan.nextInt();
		int arr[] = new int [numberOfElements];
		arr[0]=0;
		arr[1]=1;
		for(int i = 2; i<numberOfElements;i++)
		{
			arr[i] = arr[i-1]+arr[i-2];
		}
		for(int i=0; i<numberOfElements;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
