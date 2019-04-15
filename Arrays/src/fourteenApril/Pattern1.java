package fourteenApril;

public class Pattern1 {

	public static void main(String[] args)
	{
		int n=5;
		for(int j=1;j<=	n;j++)
		{
			for(int i=n;i>0;i--)
			{
				if(i!=j)
				{
					System.out.print(i);
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
