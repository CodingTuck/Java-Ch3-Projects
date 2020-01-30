package tucker3;

import java.util.Scanner;

public class Program34 {
	//SPC ID#2429488 Mitchell Tucker
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user enters the most recent president
		System.out.println("Please enter the surname of one of the 5 most recent USA presidents!:");
		String recentPresident = input.next();
		
		//answer isn't case sensitive. just has to equal the names declared
		if (recentPresident.toUpperCase().equals("TRUMP"))
			System.out.println(recentPresident + " is the 45th President of the United States.");
		else if (recentPresident.toUpperCase().equals("OBAMA"))
			System.out.println(recentPresident + " is the 44th President of the United States.");
		else if (recentPresident.toUpperCase().equals("W.BUSH"))
			System.out.println(recentPresident + " is the 43rd President of the United States.");
		else if (recentPresident.toUpperCase().equals("CLINTON"))
			System.out.println(recentPresident + " is the 42nd President of the United States.");
		else if (recentPresident.toUpperCase().equals("BUSH"))
			System.out.println(recentPresident + " is the 41st President of the United States.");
		else System.out.println("You have not entered one of the 5 most recent presidents.");
		
		}
	}

