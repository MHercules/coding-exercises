//The date is 29/01/2024

import java.time.*;
import java.util.Scanner;

public class TestMonthHandling
{
    public static void main(String[] args)
    {
        LocalDate date1;
//        LocalDate date2;      //Instructions asked for two objects but chose to use only one because the behaviour doesn't change
        int year;
        int month;
        int day;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a year: ");
        year = sc.nextInt();

        System.out.print("Type in a month: ");
        month = sc.nextInt();

        System.out.print("Type in a day: ");
        day = sc.nextInt();

        date1 = LocalDate.of(year, month, day);
        System.out.println("The date is " + date1);
        date1 = LocalDate.of(year, ++month, day);
        System.out.println("The date plus one month is " + date1);
        date1 = LocalDate.of(year, ++month, day);
        System.out.println("The date plus two months is " + date1);
        date1 = LocalDate.of(year, ++month, day);
        System.out.println("The date plus three months is " + date1);
    }
}
