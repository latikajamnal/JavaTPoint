package fourteenApril;

public class DivideStringNParts {

	public static void main(String[] args) {

		int n=3,temp=0;
		String str="Iaml5atika";
		String eqlparts[]=new String[n];
		int schar=str.length()/n;
		if(str.length()%n==0)
		{
			for(int i=0; i<str.length();i=i+schar)
			{
				String part=str.substring(i, i+schar);
				eqlparts[temp]=part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");  
	        for(int i = 0; i < eqlparts.length; i++) {  
	             System.out.println(eqlparts[i]);  
	             } 
		}
		else
		{
			System.out.println("Cannot be divided");
		}
		 

	}

}
