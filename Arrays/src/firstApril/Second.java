package firstApril;

public class Second
{
	static String countnndSay(int n) 
	{ 
		if (n == 1)     
			return "1"; 
		if (n == 2)     
			return "11"; 
		else
		{
			String str = "11";  
			System.out.println("********Inside*******");
			System.out.println();
			for (int i = 3; i <= n; i++) 
			{ 
				System.out.println("Str before: "+str);
				str += '$'; 
				System.out.println("Str after: "+str);
				int len = str.length(); 
				System.out.println("Str length: "+len);
				int cnt = 1; 
				String tmp = ""; 
				char []arr = str.toCharArray();
				for(int x=0; x<5;i++)
				{
					System.out.println("Char: "+arr[x]);
				}
			
				System.out.println("now going inside 2nd loop");
				for (int j = 1; j < len; j++) 
				{ 
					System.out.println("&&&&&&");
					if (arr[j] != arr[j - 1]) 
					{ 
						System.out.println("In IF");
						tmp += cnt + 0; 
						System.out.println("Temp: "+tmp);
						tmp += arr[j - 1]; 
						System.out.println("Temp NOW: "+tmp);
						cnt = 1; 
					} 
					else 
						cnt++; 
				}
				str = tmp; 
				System.out.println("NOWWWWWWW TEEEEMMMPPPPP: "+tmp);
			} 
			System.out.println("STRING RETURNED: "+str);
			return str;
		}
		 
	} 
	public static int add(int n)
	{
		int sum=0;
		int temp=0;
		while(n>0)
		{
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{ 
		int N = 3; 
		for(int i=1;i<=N;i++)
		{
			//String n=countnndSay(i);
			//int num=Integer.parseInt(n);
			System.out.println(countnndSay(i));
		}
    } 
}
