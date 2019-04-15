package eleventhApril;

public class Abundant {

	public static void main(String[] args) 
	{
		for(int i=1; i<=100;i++)
		{
			checkAbundant(i);
		}
		
		
		
	}
	public static void checkAbundant(int num)
	{
		int sum=0;
		for(int i=1; i<=num/2;i++)
		{
			if(num%i==0)
			{
				//fact.add(i);
				sum=sum+i;
				//System.out.println("Ele: "+i);
			}
			
		}
		if(num<sum)
		{
			System.out.println(num);
		}
	}

}
