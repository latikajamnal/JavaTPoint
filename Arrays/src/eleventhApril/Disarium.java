package eleventhApril;

public class Disarium 
{
	public static void main(String[] args) 
	{
		int n=518;
		String s =Integer.toString(n);
		int m=0,temp=0,exp=0;
		m=n;
		int j=s.length();
		while(m>0)
		{
			temp=m%10;
			exp=exp+(int) Math.pow(temp, j);
			m=m/10;
			j--;
		}
		if (n==exp)
		{
			System.out.println("Disarium");
		}
		else
		{
			System.out.println("Not a Disarium");
		}
	}
}
