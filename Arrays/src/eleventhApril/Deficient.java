package eleventhApril;

import java.util.ArrayList;

public class Deficient {

	public static void main(String[] args) {

		defNum(21);
	}
	
	public static void defNum(int num)
	{
		//ArrayList<Integer> fact=new ArrayList<Integer>();
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
		if(num>sum)
		{
			System.out.println("Def num");
		}
	}

}
