package sample.controller;

import sample.model.PlayDohCircle;

public class SampleController {
	public void start() //Need to start your code
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		System.out.println("This is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory:D");
	}
}
