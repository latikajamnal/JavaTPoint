package twelvethAprilArray;

import java.util.Scanner;

public class CopyOneArrayEleToAnother {

	public static void main(String[] args) 
	{
		int arr1[]=new int [5];
		int arr2[]= new int[arr1.length];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr1.length;i++)
		{
			arr1[i]=scan.nextInt();
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=arr1[j];
		}
		System.out.println("******************");
		for(int x=0; x<arr2.length;x++)
		{
			System.out.println(arr2[x]);
			
			
			
		}
	}

}
