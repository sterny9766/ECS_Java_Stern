
import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int number, sum = 0;
		
		
		System.out.print( "Number: " );
		number = keyboard.nextInt();
		
		for ( int i = 1; i <= number; i++ )
		{
			sum += i;
			System.out.print( i + " " );
		}
		System.out.println( "\nThe sum is " + sum + "." );
	}
}