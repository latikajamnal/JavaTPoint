package firstApril;

public class FizzBuzzWoof {

	public static void main(String[] args) 
	{
		int n =15;
		if(n>0 && n<2000000)
        {
            for(int i=1
            		; i<n; i++)
            {
            	System.out.println("Value of i: "+i);
                if(i%105==0)
                {
                    System.out.println("FizzBuzzWoof");
                }
                else if (i%3 ==0 && i%7==0)
                {
                    System.out.println("FizzWoof");
                }
                else if (i%5==0 && i%7==0)
                {
                    System.out.println("BuzzWoof");
                }
                else if (i%3 ==0 && i%5==0)
                {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0 ) {
                    System.out.println("Buzz");
                } 
                else if (i % 7 == 0) {
                    System.out.println("Woof");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }  

	}

}
