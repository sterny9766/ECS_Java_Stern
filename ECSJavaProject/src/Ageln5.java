import java.util.Scanner;

public class Ageln5
{
	public static void main( String[] args )
	{
		String name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Hello. What is your name? " );
		name = keyboard.next();
		System.out.println( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		System.out.println( "\nDid you know that in five years you will be " + (age + 5) + " years old?" );
		System.out.println( "And five years ago you were " + (age - 5) + "! Imagine that!" );
	}
}