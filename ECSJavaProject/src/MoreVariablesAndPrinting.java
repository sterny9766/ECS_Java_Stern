public class MoreVariablesAndPrinting
{
	public static void main( String[] args )
	{
		String myName, myEyes, myTeeth, myHair;  /* this line of coding set the variables eyes,name and hair to string type so its value can
		be made up of letters */
		int myAge, myHeight, myWeight;
		double Height_in_centimeters, Weight_in_kilograms;
		
		myName = "Zed A. Shaw";
		myAge = 35; // not a lie
		myHeight = 74; // inches
		myWeight = 180; // lbs
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		Height_in_centimeters = myHeight * 2.54;
		Weight_in_kilograms = myWeight * 0.454;
		
		System.out.println( "Let's talk about " + myName + "." );
		System.out.println( "He's " + myHeight+ " inches  tall." );
		System.out.println( "He's " + myWeight+ " pounds heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
		System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );
		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "." );
		System.out.println( "my weight in kilograms is " + Weight_in_kilograms );
		System.out.println( "my height in centimeters is " + Height_in_centimeters);
	}
}