package tucker3;

import java.util.Scanner;

public class Program32 {
	//SPC ID#2429488 Mitchell Tucker
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number between 300 and 400 that you think is divisible by 19!");
		int evenNum = input.nextInt();
		
		if (evenNum <= 300 || evenNum >= 400 && evenNum % 19 != 0) {
			System.out.println(evenNum + " is not an acceptable number, try again.");
		}
		else System.out.println(evenNum + " is divisible by 19 and between 300 and 400. Nice work!");
		
	}
}
