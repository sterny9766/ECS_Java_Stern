import java.util.Scanner;

public class DumbCalculator 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        double firstNumber, secondNumber, thirdNumber, result;
        
        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextDouble();
        
        System.out.print("What is your second number? ");
        secondNumber = keyboard.nextDouble();
        
        System.out.print("What is your third number? ");
        thirdNumber = keyboard.nextDouble();
        
        System.out.println();
        result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("so the avarage of the three numbers is  " + result);
    }
}