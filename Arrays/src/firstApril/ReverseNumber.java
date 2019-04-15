package firstApril;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		int reverseNumber=0;
		int temp=0;
		while(number>0)
		{
			temp=number%10;
			reverseNumber = reverseNumber*10+temp;
			number=number/10;
		}
		System.out.println("Rev Number: "+reverseNumber);
	}

}
