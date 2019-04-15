package eleventhApril;

import java.util.ArrayList;
import java.util.List;

public class AllPronic {

	public static void main(String[] args) 
	{
		int range =18;
//		for(int x=1; x<=range;x++)
//		{
//			
//			if(pronic(x)==x || x==2)
//			{
//				System.out.println("Pronic number is: "+x);
//			}
//		}
//		
		if(pronic(range)==range)
		{
			System.out.println("Pronic number is: "+range);
		}
	}
	public static int pronic(int n)
	{
		ArrayList<Integer> fact=new ArrayList<Integer>();
		boolean flag=false;
		for(int i=1; i<=n/2;i++)
		{
			if(n%i==0)
			{
				fact.add(i);
				System.out.println("Ele: "+i);
			}
			
			
		}
		for(int i=1;i<fact.size()-1;i++)
		{
			System.out.println("Here fact.get i: "+fact.get(i));
			int newNum=fact.get(i)+1;
			System.out.println("New num: "+newNum);
			
			
			if(fact.get(i+1)==newNum)
			{
				flag=true;
				break;
			}
				//System.out.println("Flag val: "+flag);
		}
		if(flag== true)
		{
			//System.out.println("Return n");
			return n;
		}
		else
		{
			return 0;
		}
		
		
	}

}
