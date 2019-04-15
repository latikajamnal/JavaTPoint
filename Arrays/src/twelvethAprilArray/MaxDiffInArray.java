package twelvethAprilArray;

public class MaxDiffInArray {

	public static void main(String[] args) {
		int a[]= {9,7,5,6,3,2};
		int maxima=0;
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=count+1;j>0;j--)
			{
				if(a[j]-a[i]>maxima)
				{
					maxima=a[j]-a[i];
				}
				count++;
			}
		}
		
		
      

	}

}
