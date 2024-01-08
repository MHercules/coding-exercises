//The date is 08/01/24

import java.util.Scanner;

public class PaintCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the width of the room? >> ");
        double width = sc.nextDouble();

        System.out.print("What is the length of the room? >> ");
        double length = sc.nextDouble();

        System.out.print("What is the height of the room? >> ");
        double height = sc.nextDouble();

        double areaOfWall = wallArea(length, height, width);
        double paintNeeded = gallonsOfPaintNeeded(areaOfWall);
        System.out.println("The number of gallons of paint needed for this job is " + paintNeeded);
        double totalPrice = pricePerGallon(paintNeeded);
        System.out.println("The cost to paint a " + width + "-by-" + length + "-foot room with " + height + "-foot ceilings is $" + totalPrice);
    }
    public static double wallArea(double length, double height, double width)
    {
       return length * height * 2 + height * width * 2;
    }
    public static double gallonsOfPaintNeeded(double areaOfWall)
    {
        return areaOfWall/350;
    }
    public static double pricePerGallon(double paintNeeded)
    {
        return paintNeeded * 32;
    }
}