//The date is 10/12/12
//Still busy with those programming exercises
//Same program as MilesConversions except with interactive input this time.

import java.util.Scanner;
public class MilesConversionsInteractive
{
	public static void main(String[] args)
	{
		final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;
        int miles;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many miles >> ");
        miles = sc.nextInt();

        int inchesInMiles = INCHES_IN_MILE * miles;
        int feetInMiles = FEET_IN_MILE * miles;
        int yardsInMiles = YARDS_IN_MILE * miles;

        System.out.println("There are " + inchesInMiles + " inches in " + miles + " miles.");
        System.out.println("There are " + feetInMiles + " feet in " + miles + " miles.");
        System.out.println("There are " + yardsInMiles + " yards in " + miles + " miles.");
	}
}