// == is used to compare both primitive and objects while = method is used to check equality of objects only.
public class VariablesAndNames
{
	public static void main( String[] args )
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		cars = 100;    // the number of cars
		space_in_a_car = 4;    // how many passengers can go inside one car
		drivers = 30;      // number of people who can drive
		passengers = 90;   // number of passengers 
		cars_not_driven = cars - drivers;   // cars that are not driven are the cars minus the drivers
		cars_driven = drivers;   // number of cars driven is the same as the number of drivers
		carpool_capacity = cars_driven * space_in_a_car;   // the carpool capacity is the cars driven times the space in each car
		average_passengers_per_car = passengers / cars_driven; /* the avarage passengers per car is the number of 
		passengers divided by number of cars driven */
		
		
		System.out.println( "There are " + cars + " cars available." );
		System.out.println( "There are only " + drivers + " drivers available." );
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today." );
		System.out.println( "We have " + passengers + " to carpool today." );
		System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
	}
}