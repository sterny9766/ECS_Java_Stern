import java.util.Random;        
public class DoubleDice
{
	public static void main (String[] args)
	{
		Random r = new Random();
		
		int rolla = 1 + r.nextInt(6);
		int rollb = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE");
		
		
		
		System.out.println();
		System.out.println("Roll #1: " + rolla);
		System.out.println("Roll #2: " + rollb);
		System.out.println("Your Total Is " + (rolla + rollb) + "!");
		
		while ( rolla != rollb)
		{
			 rolla = 1 + r.nextInt(6);
			 rollb = 1 + r.nextInt(6);
			
			System.out.println( "Roll #1: " + rolla );
			System.out.println( "Roll #2: " + rollb );
			System.out.println( "The total is " + (rolla + rollb));
			System.out.println();
		}
		
	}
}