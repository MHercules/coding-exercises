//The date is 04/02/2024

import java.util.Scanner;

public class TwoCharacters
{
    public static void main(String[] args)
    {
        MyCharacter ben = new MyCharacter();
        MyCharacter david = new MyCharacter();

        displayDetails(ben);
        displayDetails(david);
    }

    public static void displayDetails(MyCharacter c1)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the character's color:");
        c1.setColor(sc.nextLine());
        System.out.print("Type in the character's number of eyes:");
        c1.setNumberOfEyes(sc.nextInt());
        System.out.print("Type in the character's number of lives:");
        c1.setNumberOfLives(sc.nextInt());

        System.out.println("The creature's color is " + c1.getColor() + ", it has " + c1.getNumberOfEyes() + " eyes and " + c1.getNumberOfLives() + " lives.");
    }
}