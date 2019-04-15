package firstApril;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int flag=1;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Not a Prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
		
	}

}
