package eleventhApril;

public class HappyNumber {

	public static void main(String[] args)
	{
		int num=1001;
		int res=num;
		while(res!=1 && res!=4)
		{
			res=checkHappy(res);
		}
		if(res==1)
		{
			System.out.println("Happy");
		}
		else if (res==4)
		{
			System.out.println("UnHappy");
		}
	}
	public static int checkHappy(int n)
	{
		int temp=0,sum=0;
		while(n>0)
		{
			temp=n%10;
			sum=sum+temp*temp;
			n=n/10;
		}
		return sum;
	}

}
