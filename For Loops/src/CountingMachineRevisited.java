import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
		int min, max, by;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count from :" );
		min = keyboard.nextInt();
		
		System.out.print( "Count to :" );
		max = keyboard.nextInt();
		
		System.out.print( "Count by :" );
		by = keyboard.nextInt();
		
		for ( int i = min; i <= max; i = i + by )
		{
			System.out.print( i + " " );
		}
		
		System.out.println();
	}
}