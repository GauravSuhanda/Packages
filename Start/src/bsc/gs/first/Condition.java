package bsc.gs.first;

import java.util.Scanner;

public class Condition {

	private static Scanner scan;
	private static Scanner input;

	public static void main(String[] args) {

		System.out.println("Conditions in Java");

		int i= 0;

		for(i=0;i<5;i++) {

			System.out.println("This is for loop: "+i);					
		}

		if(i==5) {
			System.out.println("Its true!");
		}
		else {
			System.out.println("Your var is Out of loop");
		}

		//User Input 

		scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int v = scan.nextInt();

		System.out.println("This is a number " +v);

		int value= 0;

		do {
			System.out.print("In do loop Enter a number: ");
			value=scan.nextInt();
		}
		while (value !=5);
		{
			System.out.println("Got 5!!!");
		}
		
		//SWITCH CASES
		
		input = new Scanner(System.in);
		System.out.print("Please enter a command ");
		String text = input.next();
		
		switch (text){
		
		case "Start":{
			System.out.print("Command start executed");
			break;
		}
		case "Stop":{
			System.out.print("Command stop executed");
			break;
		}
		default:
			System.out.print("Syntax Error!!");
		}
	}

}
