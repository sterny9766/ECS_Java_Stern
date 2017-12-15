import java.util.Random;
public class RandomNumbers1 
{
	public static void main( String[]args)
	{
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		
		System.out.println("my random number is " + x);
		
		System.out.println("Here are some numbers from 1 to 5");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println( 1 + r.nextInt(5) + " ");
		System.out.println();
		
		
		
		System.out.println("Here are some numbers from 1 to 100");
		System.out.println( 1 + r.nextInt(100) + "\t ");
		System.out.println( 1 + r.nextInt(100) + "\t ");
		System.out.println( 1 + r.nextInt(100) + "\t ");
		System.out.println();
		for (int i =2; i<=10; i=i+2) 
		{ 
			System.out.println(i + ", "); 
		}
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		
		if ( num1 == num2 )
		{
			System.out.println("the random numbers were the same! weird.");
		}
		if ( num1 != num2 )
		{
			System.out.println("The random numbers were different! Not too surprising, actually.");
		}
	
	}

}
