
public class CopyFromArray {

	public static void main(String[] args) 
	{
		int array1[] = new int[] {4,7,4,9,3,10,2};
		int array2[] = new int[array1.length];
		for(int i=0; i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		System.out.println("**********************");
		for(int i=0; i<array1.length;i++)
		{
			array2[i]=array1[i];
			System.out.println("Array2: "+array2[i]);
		}
	}
}
