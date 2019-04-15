
public class FrequencyOfElements {

	public static void main(String[] args)
	{
		int array[] = new int[] {5,5,5,5,5,8,8,8};
		int tocheckVisitedEle[]= new int[array.length];
		int visited=-1;
		for(int i =0; i<array.length;i++)
		{
			int counter=1;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					counter++;
					tocheckVisitedEle[j]=visited;
				}
			}
			if(tocheckVisitedEle[i]!=visited)
			{
				tocheckVisitedEle[i]= counter;
			}
			
		}
		System.out.println("Frequency: ");
		for(int i=0; i<tocheckVisitedEle.length;i++)
		{
			if(tocheckVisitedEle[i]!=visited)
			{
				System.out.println("Frequency of "+array[i]+" = "+tocheckVisitedEle[i]);
			}
			
		}
	}

}
