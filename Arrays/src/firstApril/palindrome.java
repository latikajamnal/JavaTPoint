package firstApril;

import java.util.Scanner;

public class palindrome 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String n = scan.next();
		String rev="";
		int length=n.length();
		for(int i=length-1; i>=0; i--)
		{
			rev = rev + n.charAt(i);
		}
		System.out.println("org: "+n);
		System.out.println("rev: "+rev);
		int ten= Integer.parseInt(rev);
		
		System.out.println(ten*10);
		
	}
}
