import java.util.Scanner;
public class TwoQuestions 
{
	public static void main( String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer1, answer2;
		
		System.out.println("is it  animal, vegitable or mineral");
		answer1 = keyboard.next();
		
		System.out.println("is it bigger than a breadbox?");
		answer2 = keyboard.next();
		
		if ( answer1.equals("animal") && answer2.equals("yes"))
			System.out.println("is it a moose?");
		
		else if ( answer1.equals("animal") && answer2.equals("no"))
			System.out.println("is it a squirrel?");
		
		else if ( answer1.equals("vegitable") && answer2.equals("yes"))
			System.out.println("is it a watermelon?");
		
		else if ( answer1.equals("vegitable") && answer2.equals("no"))
			System.out.println("is it a carrot?");
		
		else if ( answer1.equals("mineral") && answer2.equals("yes"))
			System.out.println("is it Camaro");
		
		else if ( answer1.equals("mineral") && answer2.equals("no"))
			System.out.println("is it a paper clip?");
		
		
	}

}
