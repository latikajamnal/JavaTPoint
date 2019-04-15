package firstApril;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdQues {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int aCount =7;
		List<Integer> a = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
        for (int i = 0; i < aCount; i++) {
            int aItem = scan.nextInt();
            a.add(aItem);
        }
		
		
		int maxima = a.get(1) - a.get(0);
        int i,j;
        if (a.size()>=1 && a.size()<=2000000)
        {
            for (i = 0; i < a.size(); i++) 
            {
                for (j = i + 1; j < a.size(); j++) 
                {
                    if (a.get(j) - a.get(i) > maxima) 
                    {
                        maxima = a.get(j) - a.get(i);
                    }
                }
            }
        }
	}

}
