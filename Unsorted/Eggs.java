//The date is 11/12/23
/*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs or 45 
cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of 
eggs in the order and then display the amount owed with a full explanation. For example, typical output might 
be You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85. 
Save the program as Eggs.java*/

import java.util.Scanner;
public class Eggs
{
	public static void main(String[] args)
	{
	final double DOZEN_EGGS_PRICE = 3.25;
        final double SINGLE_EGG_PRICE = 0.45;
        final int A_DOZEN_IS = 12;
        int eggsWanted;
        double dozenPrice;
        double singlePrice;
        double totalPrice;
        int howManyDozen;
        int leftAfter;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many eggs do you want? ");
        eggsWanted = sc.nextInt();

        howManyDozen = eggsWanted/A_DOZEN_IS;
        leftAfter = eggsWanted%A_DOZEN_IS;
        dozenPrice = howManyDozen*DOZEN_EGGS_PRICE;
        singlePrice = leftAfter*SINGLE_EGG_PRICE;
        totalPrice = dozenPrice+singlePrice;

        System.out.println("You ordered " + eggsWanted + " eggs." + "\nThat's " + howManyDozen + " dozen at $" +
                DOZEN_EGGS_PRICE + " per dozen and " + leftAfter + " loose eggs at " + SINGLE_EGG_PRICE +
                " cents each, for a total of $" + totalPrice + ".");
	}
}
