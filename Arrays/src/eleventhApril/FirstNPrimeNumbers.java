package eleventhApril;

public class FirstNPrimeNumbers {

	public static void main(String[] args) {
		
		int n=10;
		int flag=0;
		int count=0;
		for(int j=1; j<=n;j++)
		{
			for(int i=2;i<j/2;i++)
			{
				if(j%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("PrimeNumber: "+j);
			}
			//count++;
		}
		
	}

	
	
	/*public static void main(String[] args)   
	{  
		int ct=0,n=0,i=1,j=1;  
		while(n<10)  
		{  
			j=1;  
			ct=0;  
			while(j<=i)  
			{  
				if(i%j==0)  
				{
					ct++;  
				}
				j++;   
			}  
			if(ct==2)  
			{  
				System.out.printf("%d ",i);  
				n++;  
			}  
			i++;  
		}  
	}  */
}
