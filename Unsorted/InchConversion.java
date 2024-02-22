//The date is 08/01/24
/*There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method 
accepts a value in inches from a user at the keyboard and then passes the entered value to two methods. 
One converts the value from inches to feet, and the other converts the same value from inches to yards. Each 
method displays the results with appropriate explanation. Save the application as InchConversion.java.*/

import java.util.Scanner;

public class InchConversion
{
    public static void main(String[] args)
    {
        double inches;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many inches? >> ");
        inches = sc.nextDouble();
        inchesToFeet(inches);
        inchesToYards(inches);
    }
    public static void inchesToFeet(double inches)
    {
        double footInInch = 0.0833333;
        double conversion = inches * footInInch;
        System.out.println(inches + " Inches is equal to " + conversion + " feet.");
    }
    public static void inchesToYards(double inches)
    {
        double yardInInch = 0.0277778;
        double conversion2 = inches * yardInInch;
        System.out.println(inches + " Inches is equal to " + conversion2 + " yards.");
    }
}
