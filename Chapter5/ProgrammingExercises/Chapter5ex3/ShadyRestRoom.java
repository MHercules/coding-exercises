//The date is 05/03/2024

import java.util.Scanner;

public class ShadyRestRoom
{
    public static void main(String[] args)
    {
        int numEntered;
        int priceNow;
        final int QUEEN_CODE = 1;
        final int KING_CODE = 2;
        final int KING_PULLOUT_CODE = 3;
        final int QUEEN_PRICE = 125;
        final int KING_PRICE = 139;
        final int KING_PULLOUT_PRICE = 165;
        final int INVALID_PRICE = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for the room type.");
        System.out.println("Enter 1 for Queen, 2 for King, and  3 for King with a pullout couch.");
        numEntered = sc.nextInt();

        if(numEntered == QUEEN_CODE)
        {
            priceNow = QUEEN_PRICE;
            System.out.println("The price is $" + priceNow);
        }
		else
            if(numEntered == KING_CODE)
            {
                priceNow = KING_PRICE;
                System.out.println("The price is $" + priceNow);
            }
		else
            if(numEntered == KING_PULLOUT_CODE)
            {
                priceNow = KING_PULLOUT_PRICE;
                System.out.println("The price is $" + priceNow);
            }
			else
            {
                priceNow = INVALID_PRICE;
                System.out.println("The number entered is invalid, and there exists no such room.\nPrice is $" + priceNow);
            }
    }
}