// More Fill-In Methods - Fix the broken methods and method calls (again).
import java.util.Random;
import java.util.Scanner;

public class MoreFillInMethods
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Here we go.");

		System.out.println();
		System.out.println("Some random numbers, if you please: ");
		int lo, hi;
		int val1 = 1 + r.nextInt(10);
		int val2 = 1 + r.nextInt(10);
		lo = 1;
		hi = 10;
		System.out.println("First: " + val1 );
		
		System.out.println("Second: " + val2 );
		if ( val1 == val2 )
			System.out.println("Hey!  They were the same!");
		else
			System.out.println("They were not the same.");

		System.out.println();
		System.out.print("More counting, but this time not by ones: ");
		for ( int i = 2; i <= 8; i = i + 2 )
		{
			System.out.print( i + ", " );
		}
		for ( int i = 10; i >= 2; i = i - 2 )
		{
			System.out.print( i + ", " );
		}

		System.out.println();
		System.out.println("Let's figure a project grade.");
		int a=4,b=3,c=4,d=5,e=2,f=1, result=71;
		// project_grade();
		System.out.println("434521 -> " + result );

		System.out.println();
		System.out.print("Finally, some easy ones. Please enter your name :");
		String name = keyboard.next();

		System.out.println("Hi, " + name );

		System.out.println();
		System.out.println("Do you feel lucky, punk?");
		// crash();
		System.out.println("you lose");
	}
}

/*
	public static ???? superrand( ???? )
	// Parameters are:
	//	int a;
	//	int b;
	{
		// picks a number between a and b, no matter which is larger
		int c;

		if ( a < b )	// b is larger
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )	// a is larger
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;	// or c = b; doesn't matter since they're equal

		return ??;
	}
*/


/*
 	public static ???? stepcount( ???? )
	// Parameters are:
	//     int first;
	//     int last;
	//     int step;
	{
		// counts from 'first' to 'last' by 'step'
		// handles forward and backward
		int x;

		if ( first < last )
		{
			x = first;
			while ( x <= last )
			{
				System.out.print(x + " ");
				x = x + step;
			}
		}
		else
		{
			x = first;
			while ( x >= last )
			{
				System.out.print(x + " ");
				x = x - step;
			}
		}

		return ??;
	}
*/


/*
	public static ???? project_grade( ???? )
	// Parameters are:
	//     int p1, p2, p3, p4, p5, p6;
	{
		// given six integers representing scores out of five in each of the
		// six categories for the first six weeks project: tells you your
		// overall project grade out of 100

		int overall_grade;

		overall_grade = p1 * 6;    // six points per point for the first category
		overall_grade = overall_grade + ( p2 * 6 );   // six points per point
		overall_grade = overall_grade + ( p3 * 4 );   // four points per point
		overall_grade = overall_grade + ( p4 * 2 );   // two points per point
		overall_grade = overall_grade + ( p5 * 1 );   // one point per point
		overall_grade = overall_grade + ( p6 * 1 );   // one point per point

		return ??;
	}
*/


/*
	public static ???? get_name( ???? )
	// No parameters.
	{
		// finds out the user's name
		Scanner keyboard = new Scanner(System.in);

		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.next();

		return ??;
	}
*/


/*
	public static ???? crash( ???? )
	// No parameters.
	{
		// displays "you win" or "you lose".  You lose 90% of the time.
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{
			// What do you know?  We won!
			magic_word = "win";
		}
		else
		{
			// No big suprise; we lost.
			magic_word = "lose";
		}

		System.out.print("you " + magic_word);

		return ??;
	}
*/

