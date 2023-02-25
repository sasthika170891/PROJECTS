package exceptionhandling;

public class e1 {
	
	//try:  code which is having prob of getting error
	// catch:  block which handles the exception, will be executed only when error occurs
	
	// no error:   try
	// error:    try, catch
	
	
	public static void main(String[] args) {
		
		try {
		System.out.println(3/0);
		}
		
		catch(Exception e)
		{
			System.out.println("error "+  e);
		}
	}

}
