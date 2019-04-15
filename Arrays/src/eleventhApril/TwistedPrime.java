package eleventhApril;

public class TwistedPrime {

	public static void main(String[] args)
	{
		int number=2;
		int reverse = rev(number);
		System.out.println("Rev: "+reverse);
		if(prime(number)==prime(reverse))
		{
			System.out.println("This number is a twisted Prime Number: "+number);
		}
	}
	
	public static int prime(int num)
	{
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			return num;
		}
		else
		{
			return 0;
		}
	}
	public static int rev(int n)
	{
		int rev=0;
		int temp=0;
		System.out.println("Number: "+n);
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		return rev;
	}

}
