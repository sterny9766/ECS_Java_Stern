import java.util.Scanner;

public class CountingFor
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What would you like me to repeat ?" );
		String message = keyboard.nextLine();
		
		for ( int n = 2; n <= 20 ; n += 3 )
		{
			System.out.println( n + ". " + message);
		}
	}
}