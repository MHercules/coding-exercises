//The date is 09/01/24

import java.util.Scanner;

public class BookBilling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        computeBill();

        System.out.print("Type in the quantity ordered >> ");
        int amountOrdered = sc.nextInt();
        computeBill(amountOrdered);

        System.out.print("Type in the value of your coupon >> ");
        double couponValue = sc.nextDouble();
        computeBill(amountOrdered, couponValue);

    }

    public static void computeBill()
    {
        double photoBook = 14.99;
        double taxRate = 0.08;
        double taxAmount = photoBook * taxRate;
        double totalAmount = photoBook + taxAmount;
        System.out.println("The total cost of the book is $" + totalAmount);

    }

    public static void computeBill(int amountOrdered)
    {
        double photoBook = 14.99;
        double taxRate = 0.08;
        double taxAmount = photoBook * taxRate;
        double totalAmount = photoBook + taxAmount;
        System.out.println("The total cost of the book(s) would be $" + (totalAmount * amountOrdered));
    }

    public static void computeBill(int amountOrdered, double couponValue)
    {
        double photoBook = 14.99;
        double taxRate = 0.08;
        double taxAmount = photoBook * taxRate;
        double totalAmount = photoBook + taxAmount;
        System.out.println("The total cost of the book(s) would be $" + (totalAmount * amountOrdered - couponValue));
    }
}
