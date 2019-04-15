package eleventhApril;

public class AnerageOfNumbers {

	public static void main(String[] args) {
		int number=5;
		int sum=0;
		int avg=0;
		for(int i=1; i<=number;i++)
		{
			sum=sum+i;
		}
		avg=sum/number;
		System.out.println("Avg: "+avg);
	}

}
