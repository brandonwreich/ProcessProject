package sample.controller;

import sample.model.PlayDohCircle;

import java.util.Scanner;

import sample.model.PlayDohBird;

public class SampleController {
	public void start() //Need to start your code
	{
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		PlayDohBird firstBird = new PlayDohBird();
		
		PlayDohBird secondBird;
		secondBird = new PlayDohBird();
		
		PlayDohBird thirdBird;
		thirdBird = new PlayDohBird(20);
		
		System.out.println("Here is my Play-Doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my third circle " + thirdCircle);
		
		System.out.println("Here is my Bird");
		System.out.println(firstBird);
		System.out.println("Here is my second Bird " + secondBird);
		
		System.out.println("This is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory:D");
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //Declares a scanner
		firstScanner = new Scanner(System.in); //Instantiates a scanner for the keyboard
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
		System.out.println("How old are you?");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old.");
		
	}
}
