package firstApril;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
public void meth1()
{
	
}
public void meth2()
{
	this.meth1();
}

public Factorial(int n) 
{
	this();
	
}
public Factorial() {
	
}
public Factorial(int n, int m) {
	
}
}

