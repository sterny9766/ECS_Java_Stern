import java.util.Random;     
import java.util.Scanner;    

public class Dice
{
	public static void main (String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int rolla = 1 + r.nextInt(6);
		int rollb = 1 + r.nextInt(6);
		int sum = (rolla + rollb);
		
		System.out.println("HERE COMES THE DICE");
		System.out.println();
		System.out.println("Roll #1: " + rolla);
		System.out.println("Roll #2: " + rollb);
		System.out.println("Your Total Is " + sum + "!");
		
	}
}