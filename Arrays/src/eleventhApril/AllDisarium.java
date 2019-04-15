package eleventhApril;

public class AllDisarium {

	public static void main(String[] args)
	{
		int n=100;
		for(int i=0; i<n; i++)
		{
			dis(i);
			if(dis(i)==i)
			{
				System.out.println("Number "+i+" is a Disarium");
			}
		}
		
	}
	public static int dis(int n)
	{
		String s =Integer.toString(n);
		int m=0,temp=0,exp=0;
		boolean flag;
		m=n;
		int j=s.length();;
		while(m>0)
		{
			temp=m%10;
			exp=exp+(int) Math.pow(temp, j);
			m=m/10;
			j--;
		}
		if (n==exp)
		{
			
			return n;
		}
		else
		{
			
			return 0;
		}
	}

}
