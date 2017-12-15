import java.util.Scanner;
public class ALittleQuiz 
{
	public static void main ( String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		int answer1, answer2, answer3;
		int answersright = 0;
		
		System.out.println( "Q1 - What is the capital of Alaska? " );
		System.out.println( "			1. Melbourne " );
		System.out.println( "			2. Anchorage " );
		System.out.println( "			3. Juneau " );
		System.out.println();
		System.out.print( ">");
		answer1 = keyboard.nextInt();
		
		if ( answer1 == 3 )
		{
            System.out.println("That's right!");
            ++answersright;
        }
		else
			System.out.println( "Sorry, the capital of Alaska is - 3. Juneau");
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println( "Q2 - can you stor the value cat in a variable of type Int?  " );
		System.out.println( "			1. Yes " );
		System.out.println( "			2. No " );
		System.out.println();
		System.out.print( ">");
		answer2 = keyboard.nextInt();
		
		if ( answer2 == 2 )
		{
            System.out.println("That's right!");
            ++answersright;
        }
		else 
			System.out.println( "Sorry, the value cat is a string. Ints can only store numbers");	
		
			
			
		
		System.out.println();
		System.out.println();
		System.out.println( "Q3 - what is the result of 9+6/3  " );
		System.out.println( "			1. 5 " );
		System.out.println( "			2. 11 " );
		System.out.println( "			3. 15/3 " );
		System.out.println();
		System.out.print( ">");
		answer3 = keyboard.nextInt();
		
		if ( answer3 == 2 )
		{
            System.out.println("That's right!");
            ++answersright;
        }
		else 
			System.out.println( "Sorry, the result of 9+6/3 is - 2. 11");
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println( "over all, you got " + answersright + " out of 3 correct.");
		System.out.println( "thanks for playing.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
