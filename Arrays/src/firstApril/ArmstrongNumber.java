package firstApril;

import java.util.Scanner;

public class ArmstrongNumber 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = scan.nextInt();
		int number =num;
		int temp=0, sum=0;
		
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp*temp*temp;
			num=num/10;
		}
		if(sum==number)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}

}
