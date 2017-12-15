import java.util.Scanner;

public class BetterCollatz
{
	public static void main( String[] args )
	{
		Scanner k = new Scanner(System.in);
		int number, steps = 0, largest = 0;
		
		

		System.out.println( "Let's create a COLLAT SEQUENCE !" );
		System.out.println();
		System.out.println( "Rules :" );
		System.out.println( "If the number is even, divide it by 2." );
		System.out.println( "If the number is odd, multiply by 3 and add 1.");
		System.out.println( "Repeat this decision until you reach 1");
				
		System.out.print( "\nStarting number: " );
		number = k.nextInt();
		System.out.print( "[ ");
		
		do
		{
			System.out.print( number + " - ");
			
			if ( (number % 2) == 0 )
				number /= 2;
			else
				number = (3 * number) + 1;
			if ( number > largest)
				largest = number;
			steps++;
		} while ( number > 1 );
		
		System.out.print(number);
		System.out.print( " ]");
		System.out.println("\n");
		System.out.println("Terminated after " + steps + " steps");
		System.out.println("The largest value was " + largest );
	}
} 