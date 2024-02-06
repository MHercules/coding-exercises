//The date is 06/02/2024

public class Die
{
    private final int DIE_VALUE;
    final  int LOWEST_DIE_VALUE = 1;
    final  int HiGHEST_DIE_VALUE = 6;

    Die()
    {
        this.DIE_VALUE = (int) (Math.random() * ((HiGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1) + LOWEST_DIE_VALUE); //This is my code based on what I looked up
        //randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE); This is the given code to work out a random

    }

    public int getDIE_VALUE()
    {
        return DIE_VALUE;
    }
}