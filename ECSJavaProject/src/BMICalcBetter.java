import java.util.Scanner;

public class BMICalcBetter
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double m, kg, bmi, inch, lbs, feet, inch_h;
		
		System.out.print( "BMI ( Body Mass Index ) is a way of representing your size " );
		System.out.print( "How many feet tall are you?" );
		feet = keyboard.nextInt() ;
		System.out.print( "How many inches?");
		inch = keyboard.nextInt();
		inch_h = ( feet*12 + inch );
		
		System.out.print( "How many pounds do you weight?" );
		lbs = keyboard.nextDouble();
		
		
		m = inch_h / 39.370;
		
		kg = lbs / 2.2046;
		
		bmi = kg / (m*m);
		
		System.out.println ( "Your BMI is " + bmi );
		
		if ( bmi <18.5)
			System.out.println("you are underweight");
		
		else if ( bmi >= 18.5 && bmi < 25)
			System.out.println("you are normal");
		
		else if ( bmi >= 25  && bmi < 30)
			System.out.println("you are overweight");
		
		else if ( bmi == 30 || bmi > 30)
			System.out.println("you are obese");
		
		
		
		
		
	}
}