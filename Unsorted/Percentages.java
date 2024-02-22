//The date is 05/01/24
/*Create an application named Percentages whose main() method holds two double variables, and prompt 
the user for values. Pass both variables to a method named computePercent() that displays the two values 
and the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, 
the method should display a statement similar to 2.0 is 40 percent of 5.0. Then call the method a second time, 
passing the values in reverse order. Save the application as Percentages.java.*/

import java.util.Scanner;

public class Percentages
{
	public static void main(String[] args)
	{
		double percOne;
		double percTwo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in your first number >> ");
		percOne = sc.nextDouble();
		System.out.print("Type in your second number >> ");
		percTwo = sc.nextDouble();
		computePercent(percOne, percTwo);
		
	}
	public static void computePercent(double percentOne, double percentTwo)
	{
		double answer = (percentOne/percentTwo)*100;
		double answerTwo = (percentTwo/percentOne)*100;
		System.out.println(percentOne + " is " + answer + "% of " + percentTwo);
		System.out.println(percentTwo + " is " + answerTwo + "% of " + percentOne);
	}
}
