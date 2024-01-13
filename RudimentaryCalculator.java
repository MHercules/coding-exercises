//The date is 13/01/24

import java.util.Scanner;

public class RudimentaryCalculator
{
	public static void main(String[] args)
	{
		int firstNumber;
		int secondNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number >> ");
		firstNumber = sc.nextInt();
		System.out.print("Enter your second number >> ");
		secondNumber = sc.nextInt();
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + addNumbers(firstNumber, secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + subtractNumbers(firstNumber, secondNumber));
	}
	
	public static int addNumbers(int first, int second)
	{
		return first + second;
	}
	
	public static int subtractNumbers(int first, int second)
	{
		return first - second;
	}
}