package tucker3;

import java.util.Scanner;

public class Program33 {
	//SPC ID#2429488 Mitchell Tucker
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user enters the most recent president
		System.out.println("Please enter the surname of one of the 5 most recent USA presidents!:");
		String recentPresident = input.next();
		
		//recent president is returned and if not recent, displays message. user can enter any key case
		switch (recentPresident.toUpperCase()) {
			case "TRUMP":
			case "OBAMA":
			case "BUSH":
			case "CLINTON":
				System.out.println(recentPresident + " is one of the 5 most recent presidents, good job.");
			break;
			default: System.out.println("You have not entered one of the 5 most recent presidents.");
		
		}
	}

}
