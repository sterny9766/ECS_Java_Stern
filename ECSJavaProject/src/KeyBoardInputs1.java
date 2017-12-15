import java.util.Scanner;
public class KeyBoardInputs1 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name ?");
		name = keyboard.next();
		
		System.out.println(" How old are you");
		age = keyboard.nextInt();
		
		System.out.println( " How many feet talll are you");
		feet = keyboard.nextInt();
		
		System.out.print(" How many inches");
		inches = keyboard.nextInt();
		
		System.out.println(" How much do you weight");
		weight  = keyboard.nextDouble();
		
		System.out.println( " so your name is " + name + ", you are " + age + " years old, you're " + feet + "'" + inches + ", and you weight " + weight + " pounds.");
		
		
		
	}
}
