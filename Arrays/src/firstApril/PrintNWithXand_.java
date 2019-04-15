package firstApril;


public class PrintNWithXand_ {

	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		int n = 5;
		for(int i =0; i<n;i++)
		{
			System.out.print(" X ");
			for(int j=1; j<n-1;j++)
			{
				if(i==j)
				{
					System.out.print(" X ");
				}
				else
				{
					System.out.print(" _ ");
				}
			}
			System.out.print(" X ");
			System.out.println();
		}
	}
}
