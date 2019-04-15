package firstApril;

import java.io.IOException;

class Airplane
{
	public Airplane() throws IOException
	{
		System.out.println("Airplane");
		throw new IOException();
	}
}
class Airjet extends Airplane
{
	public Airjet() throws IOException
	{
		
	}
}



public class Tester {

	public static void main(String[] args) {
		
		try
		{
			new Airjet();
		}
		catch(IOException e)
		{
			System.out.println("IO ex is thrown is tester");
		}

	}

}
