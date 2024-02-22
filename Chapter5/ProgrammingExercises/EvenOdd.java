//The date is 22/02/2024

import java.util.Scanner;

public class EvenOdd
{

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if(isEven(num) == true)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }
}