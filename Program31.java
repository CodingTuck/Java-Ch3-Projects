package tucker3;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		//SPC ID#2429488 Mitchell Tucker
		Scanner input = new Scanner(System.in);
		//User enters 3 test scores
		System.out.println("Please enter your 3 test scores:");
		System.out.println();
		System.out.println("Test Score 1: ");
		int score1 = input.nextInt();
		System.out.println("Test Score 2: ");
		int score2 = input.nextInt();
		System.out.println("Test Score 3: ");
		int score3 = input.nextInt();
		
		//3 test scores divided by 3 to get average
		int averageScore = (score1 + score2 + score3) / 3;
		
		//Calculates the average score and returns a letter grade equivalent to the score
		if (averageScore >= 90 && averageScore <= 100) 
			System.out.println("You're average score is: " + averageScore + "! You got an A! Nice work!");
		else if (averageScore >= 80 && averageScore < 90)
			System.out.println("You're average score is: " + averageScore + "! You got a B!");
		else if  (averageScore >= 70 && averageScore < 80)
			System.out.println("You're average score is: " + averageScore + "! You got a C! Keep studying! You'll get there!");
		else if (averageScore >= 60 && averageScore < 70)
			System.out.println("You're average score is: " + averageScore + " "
					+ "! You got a D.. You'll need to retake this class to transfer.");
		else System.out.println("You're average score is: " + averageScore + "! You got an F. You have failed.");
		
		
		
		

	}

}
