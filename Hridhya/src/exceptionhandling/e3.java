package exceptionhandling;

public class e3 {
	

	public static void main(String[] args) {
		
		try {
		System.out.println(3/1);
		}
		
		catch(Exception e)
		{
			System.out.println("error "+  e);
		}
		
		finally
		{
			System.out.println("always execute ");
		}
	}

}
