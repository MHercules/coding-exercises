//The date is 22/01/2024

import java.util.Scanner;

public class TestPatient
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Patient patient1 = new Patient();
        BloodData bt = new BloodData();     //declare an object of class BloodData to get their values

        System.out.print("The patient's id number is: " + patient1.getIdNumber());
        System.out.print("\nThe patient's age is: " + patient1.getAge());
        System.out.println("\nThe patient's blood data is: " + bt.getBloodType() + " , " + bt.getRhFactor());

        System.out.print("\nType in patient's id number: ");
        int idPrompt = sc.nextInt();
        sc.nextLine();

        System.out.print("Type in patient's age: ");
        int agePrompt = sc.nextInt();
        sc.nextLine();

        System.out.print("Type in patient's blood data: ");
        bt.setBloodType(sc.nextLine());
        bt.setRhFactor(sc.nextLine());

        Patient patient2 = new Patient(idPrompt, agePrompt, bt.getBloodType(), bt.getRhFactor());
        System.out.print("\nThe patient's id number is: " + patient2.getIdNumber());
        System.out.print("\nThe patient's age is: " + patient2.getAge());
        System.out.print("\nThe patient's blood data is: " + bt.getBloodType() + " ," + bt.getRhFactor());
    }
}