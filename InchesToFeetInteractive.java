//The date is 10/12/23
/*Write a program that declares a variable named inches, which holds a length in inches, and assign a 
value. Display the value in feet and inches; for example, 86 inches becomes 7 feet and 2 inches. Be sure to 
use a named constant where appropriate. Save the program as InchesToFeet.java*/

import java.util.Scanner;
public class InchesToFeetInteractive
{
	public static void main(String[] args)
	{
		final int INCHES_IN_FOOT = 12;
        int inches;
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the amount of inches >> ");
        inches = sc.nextInt();

        int feet = inches/INCHES_IN_FOOT;
        int inchesLeft = inches%INCHES_IN_FOOT;

        System.out.println(inches + " inches converted is " + feet +
                " foot and " + inchesLeft + " inches");
	}
}