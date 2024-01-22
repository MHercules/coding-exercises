//The date is 22/01/2024

import java.util.Scanner;

public class TestBloodData
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BloodData bloodData1 = new BloodData();         //First instance of an object of class BloodData, uses default constructor values

        System.out.println("Your blood type is: " + bloodData1.getBloodType());
        System.out.println("Your blood RH factor is: " + bloodData1.getRhFactor());

        System.out.print("\nType in your blood type: ");
        String type = sc.nextLine();                    //Blood types are O, A, B, AB

        System.out.print("Type in your RH factor: ");
        String rH = sc.nextLine();                      //"+" and "-"

        BloodData bloodData2 = new BloodData(type, rH); //Second instance of an object of class BloodData, uses overloaded constructor values
        System.out.println("\nYour blood type is: " + bloodData2.getBloodType());
        System.out.println("Your blood RH factor is: " + bloodData2.getRhFactor());

        bloodData1 = new BloodData(type, rH);   //First object being reassigned the values of object 2
        System.out.println("\nYour blood type is: " + bloodData1.getBloodType());
        System.out.println("Your blood RH factor is: " + bloodData1.getRhFactor());
    }
}