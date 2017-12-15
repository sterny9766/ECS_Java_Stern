import java.util.Scanner;
public class HowOldSpecifically 
{
	public static void main( String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("Hey, What's your name?");
        name = keyboard.next();
        
        System.out.print("ok " + name + ", how old are you?");
        age = keyboard.nextInt();
		
        if ( age < 16 )
        {
        	System.out.println( "you cannot drive." );
        }
        
        else if ( age > 15 && age < 18 )
        {
        	System.out.println( "you can drive but not vote." );	
        }
		
        else if( age > 17 && age < 25 )
        {
        	System.out.println( "you can vote but not rent a car." );
        }
		
        else
        {
        	System.out.println( "you can pretty much do whtever you want." );
        }
		
		
		
		
		
		
		
	}

}
