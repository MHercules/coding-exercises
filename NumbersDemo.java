//The date is 04/01/2024
/*Create an application named NumbersDemo whose main() method holds two integer variables. Prompt the 
user for values for the variables. In turn, pass each value to methods named displayTwiceTheNumber(), 
displayNumberPlusFive(), and displayNumberSquared(). Create each method to perform the task 
its name implies. Save the application as NumbersDemo.java*/

import java.util.Scanner;

public class NumbersDemo
{
    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a value to x >> ");
        x = sc.nextInt();
        System.out.print("Give a value to y >> ");
        y = sc.nextInt();
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
    }

    public static void displayTwiceTheNumber(int a, int b)
    {
        System.out.print("Displaying your x twice >> " + a + ", ");
        System.out.println(a);
        System.out.print("Displaying your y twice >> " + b + ", ");
        System.out.println(b);
    }

    public static void displayNumberPlusFive(int c, int d)
    {
        System.out.println("Your x + 5 >> " + (c + 5));
        System.out.println("Your y + 5 >> " + (d + 5));
    }

    public static void displayNumberSquared(int e, int f)
    {
        System.out.println("Your x squared >> " + (e * e));
        System.out.println("Your y squared >> " + (f * f));
    }

}