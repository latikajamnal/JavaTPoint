
public class Switch {

	public static void main(String[] args) 
	{
		int num=1;
		int var;
		
		switch(num)
		{
			case 1: case 7: case 10:
				var=10;
				break;
			case 2:
				var=20;
				break;
			case 3:
				var=30;
				break;
			default:
				var=100;
				break;
		}
		System.out.println("Variable: "+var);
	}

}
