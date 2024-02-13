//The date is 07/02/2024

import java.util.Scanner;

public class QuizScore
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		score = (int) (Math.random() * ((10 - 1) + 1) + 1); //Score is between 1 and 10
		System.out.println(score);
		if(score == 10)
		{
			System.out.println("Perfect score!!");
		}
	}
}

