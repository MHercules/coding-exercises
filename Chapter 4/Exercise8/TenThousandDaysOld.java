//The date is 30/01/2024

import java.util.Scanner;
import java.time.*;

public class TenThousandDaysOld
{

    public static void main(String[] args)
    {
        tenThousandDays();
    }

    public static void tenThousandDays()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in your birth-year:");
        int year = sc.nextInt();

        System.out.print("Type in your birth-month:");
        int month = sc.nextInt();

        System.out.print("Type in your birth-day:");
        int day = sc.nextInt();

        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        LocalDate dateNow = LocalDate.now();
        final int TEN_THOUSAND = 10000;

        System.out.println("You were born on " + dateOfBirth);
        System.out.println("You will be " + TEN_THOUSAND + " days old on " + dateOfBirth.plusDays(TEN_THOUSAND));
    }
}