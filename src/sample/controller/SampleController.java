package sample.controller;

import sample.model.PlayDohCircle;
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
}
