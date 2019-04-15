package firstApril;

import java.util.Scanner;

public class InsertionSort 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int temp=0;
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=scan.nextInt();
		}
		
		//Display initial array
		System.out.println("Display initial array");
		for(int i=0; i<n; i++)
		{
			System.out.println("Array elements at position "+i+": "+a[i]);
		}
		
		System.out.println("Start sort");
		//Insertion Sort
		
		for(int i=1; i<n;i++)
		{
			temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
					a[j]=a[j-1];
					j=j-1;
			}
			a[j]=temp;
		}
		
		//Display Final array
		for(int i=0; i<n; i++)
		{
			System.out.println("Array position "+i+": "+a[i]);
		}
		
	}
}
