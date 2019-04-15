package twelvethAprilArray;

public class PrintDuplicate {

	public static void main(String[] args)
	{
		/*int visited=-1;
		int arr[]= {1,4,2,2,1,3,1,2,3,4,2,5};
		int dup[]=new int[arr.length];
		for(int i=0; i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					dup[j]=visited;
				}
			}
			if(dup[i]!=visited)
			{
				dup[i]=count;
			}
			
		}
		for(int i=0; i<dup.length;i++)
		{
			if(dup[i]!=visited && dup[i]>1)
			{
				System.out.println("Duplicates are: "+arr[i]);
			}
		}*/
	
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8,2, 8, 3};   
        
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}
	
	

}
