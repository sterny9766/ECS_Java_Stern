import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, planet;
		double space_weight = 0;
		
		System.out.println( "Please enter your current earth weight in pounds: " );
		weight = keyboard.nextInt();
		
		System.out.println( "I have information for the following planets:" );
		System.out.println( "   1. Venus   2. Mars   3. Jupiter" );
		System.out.println( "   4. Saturn  5. Uranus 6. Neptune" );
		
		System.out.println( "Which planet are you visiting? (type planet number) " );
		planet = keyboard.nextInt();
		
		if ( planet == 1 ) 
			space_weight = weight * 0.78;
		
		else if ( planet == 2 ) 
			space_weight = weight * 0.39;
		
		else if ( planet == 3 ) 
			space_weight = weight * 2.65;
		
		else if ( planet == 4 )
			space_weight = weight * 1.17;
		
		else if ( planet == 5 ) 
			space_weight = weight * 1.05;
		
		else if ( planet == 6 ) 
			space_weight = weight * 1.23;
		
		System.out.println( "Your weight would be " + space_weight + " pounds on that planet." );
	}
}