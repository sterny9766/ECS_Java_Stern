import java.util.Scanner;
public class NameAgeSalary 
{
	public static void main( String[] args)
	{
		int  age;
		double salary;
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.println( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "so you are " + age + "? I guess that's not too old, " + name + ". How much do you make per hour?");
		salary = keyboard.nextDouble();
		
		System.out.println( "wow, $" + salary + " is a lot for your age!");		
		
	}

}
