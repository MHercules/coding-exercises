//The date is 28/01/2024

import java.util.Scanner;
import java.lang.Math;

public class MathTest
{
    public static void main(String[] args)
    {
        int number;
        double decimalNum;

        squareRoot();
        random();
        roundFloorCeiling();
        minMax();
    }

    public static void squareRoot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a number to find out it's square root: ");
        int number = sc.nextInt();
        System.out.println((int) Math.sqrt(number));
    }

    public static void random()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the highest number to stop at: ");
        int number = sc.nextInt();
        double i = Math.random() * number;
        System.out.println("The random number is: '" + i + "'");
    }

    public static void roundFloorCeiling()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number to calculate it's floor, ceiling, and round it off: ");
        double number = sc.nextDouble();

        System.out.println("Round off of number is: " + Math.round(number));
        System.out.println("Ceiling of " + number + " is: " + Math.ceil(number) );
        System.out.println("Floor of " + number + " is: " + Math.floor(number) );

    }

    public static void minMax()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in an int; ");
        int number = sc.nextInt();

        System.out.println("Type in a double; ");
        double number2 = sc.nextDouble();

        System.out.println("The minimum value between '" + number + "' and '" + number2 + "' is = " + Math.min(number, number2));
        System.out.println("The maximum value between '" + number + "' and '" + number2 + "' is = " + Math.max(number, number2));
    }
}