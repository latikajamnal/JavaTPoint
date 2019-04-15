package eleventhApril;

public class Harshad {

	public static void main(String[] args) 
	{
		int n=156;
		int m=n;
		int sum=0,temp=0;
		while(m>0)
		{
			temp=m%10;
			sum=sum+temp;
			m=m/10;
		}
		if(n%sum==0)
		{
			System.out.println("Harshad");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
